package com.example.mybatistest.controller;


import com.example.mybatistest.model.Test;
import com.example.mybatistest.service.JspService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class JspController {
    private final JspService jspService;

    @GetMapping({""})
    public ModelAndView homePage(ModelAndView modelAndView) {
        modelAndView.addObject("name", "홍길동");
        modelAndView.setViewName("home");
        modelAndView.setStatus(HttpStatus.OK);
        return modelAndView;
    }

    @GetMapping({"home"})
    public String redirectHome() {
        return "redirect:";
    }

    @GetMapping("form-test")
    public String formTestPage() {
        return "form-test";
    }

    @PostMapping("form-test")
    public ModelAndView formTest(@RequestParam("testForm") String testForm, @RequestParam("amount") int amount, ModelAndView mv) {
        Test test = new Test();
        String name = testForm + amount;
        test.setName(name);
        int id = jspService.insertTest(test);
        if(id > 0)  {
            mv.setStatus(HttpStatus.CREATED);
            mv.addObject("name", name);
            mv.setViewName("home");
        }
        else{
            mv.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            mv.setViewName("error/error");
        }
        return mv;
    }
}

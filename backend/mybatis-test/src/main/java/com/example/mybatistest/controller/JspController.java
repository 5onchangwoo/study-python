package com.example.mybatistest.controller;


import org.apache.coyote.Request;
import org.apache.tomcat.util.http.Parameters;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/")
public class JspController {

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
    public String formTestPage(){
        return "form-test";
    }
    @PostMapping("form-test")
    public ModelAndView formTest(@RequestParam("testForm") String testForm, @RequestParam("amount") int amount, ModelAndView mv) {
        System.out.println(testForm);
        System.out.println(amount);
        mv.addObject("name", testForm + amount);
        mv.setViewName("home");
        return mv;
    }



}

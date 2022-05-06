package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.v5.adapter.ControllerV3HandlerAdapter;
import hello.servlet.web.frontcontroller.v5.adapter.ControllerV4HandlerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HandlerAdapters {
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();
    public HandlerAdapters() {
        handlerAdapters.add(new ControllerV3HandlerAdapter());
        handlerAdapters.add(new ControllerV4HandlerAdapter());
    }
    public List<MyHandlerAdapter> getHandlerAdapters() {
        return handlerAdapters;
    }
}

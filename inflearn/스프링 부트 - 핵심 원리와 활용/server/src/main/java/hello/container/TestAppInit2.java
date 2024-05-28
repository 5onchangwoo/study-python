package hello.container;

import jakarta.servlet.ServletContext;

public class TestAppInit2 implements AppInit2{
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("TestAppInit2.onStartup");
    }
}

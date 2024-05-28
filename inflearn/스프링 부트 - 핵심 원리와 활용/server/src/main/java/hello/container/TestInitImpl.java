package hello.container;

import jakarta.servlet.ServletContext;

public class TestInitImpl implements TestInit {
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("TestInitImpl.onStartup");
    }
}

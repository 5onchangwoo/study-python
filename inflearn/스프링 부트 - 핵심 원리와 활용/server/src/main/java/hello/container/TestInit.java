package hello.container;

import jakarta.servlet.ServletContext;

public interface TestInit {
    void onStartup(ServletContext servletContext);
}

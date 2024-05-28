package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit2 {
    void onStartup(ServletContext servletContext);
}

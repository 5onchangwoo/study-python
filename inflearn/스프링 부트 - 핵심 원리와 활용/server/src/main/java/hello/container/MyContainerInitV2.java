package hello.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

@HandlesTypes({AppInit.class, AppInit2.class})
public class MyContainerInitV2 implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyContainerInitV2.onStartup");
        System.out.println("set = " + set);
        System.out.println("servletContext = " + servletContext);

        for (Class<?> appInitClass : set) {
            try {
                Object o = appInitClass.getDeclaredConstructor().newInstance();
                for (Class<?> anInterface : appInitClass.getInterfaces()) {
                    if(anInterface == AppInit.class) {
                        // new AppInitV1Servlet()과 같은 코드
                        AppInit appInit = (AppInit) o;
                        appInit.onStartup(servletContext);
                    } else if (anInterface == AppInit2.class) {
                        AppInit2 appInit2 = (AppInit2) o;
                        appInit2.onStartup(servletContext);
                    }
                }
                System.out.println(appInitClass);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package hello.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.HandlesTypes;

import java.util.Set;

@HandlesTypes({AppInit.class, TestInit.class})
public class MyContainerInitV2 implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyContainerInitV2.onStartup");
        System.out.println("MyContainerInitV2.set = " + set);
        System.out.println("MyContainerInitV2.servletContext = " + servletContext);

        for (Class<?> appInitClass : set) {
            try {
                Object o = appInitClass.getDeclaredConstructor().newInstance();
                for (Class<?> anInterface : appInitClass.getInterfaces()) {
                    if(anInterface == AppInit.class) {
                        // new AppInitV1Servlet()과 같은 코드
                        AppInit appInit = (AppInit) o;
                        appInit.onStartup(servletContext);
                    } else if (anInterface == TestInit.class) {
                        TestInit testInit = (TestInit) o;
                        testInit.onStartup(servletContext);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

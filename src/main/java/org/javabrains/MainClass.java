package org.javabrains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();

        AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
        factory.registerShutdownHook();
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();
        factory.close();
    }
}

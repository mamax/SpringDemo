package org.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
//        Triangle triangle = new Triangle();

        BeanFactory factory = new ClassPathXmlApplicationContext("spring-config.xml");
        Triangle triangle = (Triangle) factory.getBean("triangle-alias");
        triangle.draw();
    }
}

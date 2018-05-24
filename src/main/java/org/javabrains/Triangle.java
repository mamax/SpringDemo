package org.javabrains;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Data
public class Triangle implements ApplicationContextAware, BeanNameAware{

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private ApplicationContext context = null;

    public void draw(){
        System.out.println(String.format("Point A : {%d x %d}", pointA.getX(), pointA.getY()));
        System.out.println(String.format("Point B : {%d x %d}", pointB.getX(), pointB.getY()));
        System.out.println(String.format("Point C : {%d x %d}", pointC.getX(), pointC.getY()));
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public void setBeanName(String beanName) {
        System.out.println("Bean name is : "+ beanName);
    }
}

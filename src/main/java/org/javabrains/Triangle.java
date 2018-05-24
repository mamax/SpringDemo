package org.javabrains;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;

@Data
public class  Triangle implements BeanNameAware {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw(){
        System.out.println(String.format("Point A : {%d x %d}", pointA.getX(), pointA.getY()));
        System.out.println(String.format("Point B : {%d x %d}", pointB.getX(), pointB.getY()));
        System.out.println(String.format("Point C : {%d x %d}", pointC.getX(), pointC.getY()));
    }

    public void setBeanName(String beanName) {
        System.out.println("BeanName is :"+ beanName);
    }

    /*public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization method has been called for Triangle");
    }

    public void destroy() throws Exception {
        System.out.println("CleanUp code before bean has been destroyed for Triangle");
    }*/

    public void myInit(){
        System.out.println("Initialization method has been called for Triangle");
    }

    public void myDestroy(){
        System.out.println("CleanUp code before bean has been destroyed for Triangle");
    }
}

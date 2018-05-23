package org.javabrains;

import lombok.Data;

@Data
public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public void draw(){
        System.out.println(String.format("Point A : {%d x %d}", pointA.getX(), pointA.getY()));
        System.out.println(String.format("Point B : {%d x %d}", pointB.getX(), pointB.getY()));
        System.out.println(String.format("Point C : {%d x %d}", pointC.getX(), pointC.getY()));
    }
}

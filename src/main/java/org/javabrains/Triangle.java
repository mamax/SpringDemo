package org.javabrains;

import lombok.Data;

import java.util.List;

@Data
public class Triangle {

    private List<Point> points;

    public void draw(){
        for (Point point : points){
            System.out.println(String.format("Point : {%d x %d}", point.getX(), point.getY()));
        }
    }
}

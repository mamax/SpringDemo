package org.javabrains;

public class Triangle {

    public String getType() {
        return type;
    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public Triangle(String type) {
        this.type = type;
    }

    private String type;

    public void draw(){
        System.out.println("The type : " + getType());
        System.out.println("Triangle has been draw");
    }
}

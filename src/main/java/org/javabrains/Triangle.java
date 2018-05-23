package org.javabrains;

public class Triangle {

    public String getType() {
        return type;
    }
//
//    public void setType(String type) {
//        this.type = type;
//    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    private String type;

    public int getHeight() {
        return height;
    }

    private int height;

    public void draw(){
        System.out.println("The type : " + getType());
        System.out.println("The height : "+ height);
        System.out.println("Triangle has been draw");
    }
}

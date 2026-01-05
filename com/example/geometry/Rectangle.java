package com.example.geometry;

public class Rectangle {
    public double length;
    public double width;
    public Rectangle(){

    }
    public Rectangle(double l,double b){
        length=l;
        width=b;
    }
    //methods
    public double areaOfRectangle(double l,double b){
        return l*b;
    }
    public double perimeterOfRectangle(double l,double b){
        return 2*(l+b);
    }

}



package com.example.geometry;

public class Circle {
    public double radius;
    //constructor
    public Circle(){

    }
    public Circle(double r){
        radius=r;
    }
    //methods
    public double areaOfCircle(double r){
        return Math.PI*r*r;
    }
    public double circumferenceOfCircle(double r){
        return Math.PI*2*r;
    }

}

package com.example.utils;
//import com.example.geometry.*; //imports all classes but not recommended
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator");
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        System.out.println("Area of circle is "+c.areaOfCircle(4.2));
        System.out.println("Circumference of circle is "+c.circumferenceOfCircle(4.2));
        System.out.println("Area of rectangle is "+r.areaOfRectangle(4,3.5));
        System.out.println("Perimeter of rectangle is "+r.perimeterOfRectangle(4,3.5));
    }
}

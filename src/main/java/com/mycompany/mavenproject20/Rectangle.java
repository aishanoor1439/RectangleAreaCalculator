
package com.mycompany.mavenproject20;

//Class Definition
public class Rectangle {
    
//    Attributes
    static private double width;
    static private double height;
    static private double area;
    
//    Methods
//    Constructors
    Rectangle(double width, double height){
       this.width = width;
       System.out.println("Width: " + width);
       this.height = height;
       System.out.println("Height: " + height);
   }
    
    static public void calArea(){
        area = width * height;
        System.out.println("Area: " + area);
    }
}

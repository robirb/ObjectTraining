package com.company;

import com.company.Model.Car;
import com.company.Model.Rectangle;
import com.company.Model.Shape;
import com.company.Model.Square;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rectangle rectangle1 = new Rectangle(20,10);
        Rectangle rectangle2= new Rectangle(30,50);
        Rectangle rectangle3= new Rectangle(80,50);




        /*System.out.println("Area is : "+rectangle1.getArea());
        System.out.println("Perimeter is : "+rectangle1.getPerimeter()+"\n");
        System.out.println("Area is : "+rectangle2.getArea());
        System.out.println("Perimeter is : "+rectangle2.getPerimeter()+"\n");
        System.out.println("Area is : "+rectangle3.getArea());
        System.out.println("Perimeter is : "+rectangle3.getPerimeter()+"\n");

        Square square = new Square(25);
        System.out.println("Area is : "+square.getArea());
        System.out.println("Perimeter is : "+square.getPerimeter());
        System.out.println("Perimeter is : "+square.getDiagonal());*/


        Car car = new Car("Ferreri");
        System.out.println(car.getCc());
        System.out.println(car.getColor());
        car.setColor("Red");

        System.out.println(car.getColor());

        double travelDistance = car.travelDistance(5);

        System.out.println("Travel Distance is "+travelDistance+" m");






    }
}

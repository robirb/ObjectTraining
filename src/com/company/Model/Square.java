package com.company.Model;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    public double getDiagonal(){
        return Math.sqrt(2*getLength()*getLength());
    }

}

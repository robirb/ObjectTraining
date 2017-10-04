package com.company.Model;

import java.awt.*;

public class Car {
    private String brandName;
    private int cc;
    private String color;
    private double acceleration;
    private double initialVelocity;

    public Car(String brandName, int cc, String color,double acceleration,double initialVelocity) {
        this.brandName = brandName;
        this.cc = cc;
        this.color = color;
        this.acceleration = acceleration;
        this.initialVelocity = initialVelocity;
    }

    public Car(String brandName, int cc) {
        this(brandName,cc,"Black",10,0);
    }

    public Car(String brandName){
        this(brandName,100);
    }


    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double travelDistance(int time){
        return initialVelocity*time+0.5*acceleration*time*time;
    }
}

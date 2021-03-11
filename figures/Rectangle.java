package com.company.figures;

public class Rectangle extends Figura {
    double l1;
    double l2;

    public Rectangle(double l1, double l2)
    {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double area()
    {
        return l1 * l2;
    }

    public String toString(){
        return "Rectangle: " + this.area();
    }
}
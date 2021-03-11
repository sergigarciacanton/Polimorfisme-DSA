package com.company.figures;

public class TriangleEQ extends Figura {
        double b;
        double h;

        public TriangleEQ(double b, double h) {
                this.b = b;
                this.h = h;
        }

        public double area() {
                return (b * h) / 2;
        }

        public String toString(){
                return "Triangle:" + this.area();
        }
}
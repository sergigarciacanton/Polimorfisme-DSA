package com.company.figures;

public class Cercle extends Figura
    {
        double r;

        public Cercle(double r) {

            this.r = r;
        }

        public double area()
        {
            return 3.141592 * r * r;
        }

        public String toString(){
            return "Cercle:" + this.area();
        }
    }
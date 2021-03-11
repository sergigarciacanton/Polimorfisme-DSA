package com.company.figures;

public class Quadrat extends Rectangle {
        public Quadrat(double l) {
            super(l,l);
        }

    public String toString(){
        return "Quadrat: " + super.area();
    }
}
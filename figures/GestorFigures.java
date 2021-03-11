package com.company.figures;

import java.util.Arrays;


public class GestorFigures {

    public static double suma(Figura[] vector) {
        double suma = 0;
        for(int i = 0; i < vector.length; i++) {
            suma = suma + vector[i].area();
        }
        return suma;
    }

    public static void sort(Figura[] vector) {
        Arrays.sort(vector);
    }

    public static void main(String[] args) {
        Figura[] vector = new Figura[4];
        vector[0] = new Quadrat(1);
        vector[1] = new Cercle(2);
        vector[2] = new TriangleEQ(4, 2);
        vector[3] = new Rectangle(2, 3);
        double suma = GestorFigures.suma(vector);
        System.out.println(Arrays.toString(vector));
        GestorFigures.sort(vector);
        System.out.println(Arrays.toString(vector));
        System.out.println("La suma de les arees de l'Array es: " + suma);
    }
}


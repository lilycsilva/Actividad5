package com.company;

public class Main {

    public static void main(String[] args)
    {
        int X = 20;
        int Y = 9;

        System.out.println("X = " + X);
        System.out.println("Y = " + Y);

        int Suma = X + Y;
        System.out.println("Suma: " + Suma);

        int Resta = X - Y;
        System.out.println("Resta: " + Resta);

        double Multiplicacion = X * Y;
        System.out.println("Multiplicacion: " + Multiplicacion);

        double Division = X / Y;
        System.out.println("Division: " + Division);

        //Residuo division
        double Modulo = X % Y;
        System.out.println("Modulo: " + Modulo);
    }
}

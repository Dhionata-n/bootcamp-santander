package org.example;

public class Area {

    public static void calcularArea(double lado){
        System.out.println("Area do quadrado : " + (lado*lado));

    }
    public static void calcularArea(double lado, double lado2){
        System.out.println("Area do retangulo : " + (lado*lado2));

    }
    public static void calcularArea(double ladoMenor, double ladoMaior, double altura){
        System.out.println("Area do trapézio : " + (ladoMenor*ladoMaior*altura));

    }

}

package com.cristhianurrego.taller_2.punto7;

/**
 * Created by Afuro on 10/03/2017.
 */
public class RunTest {


    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5);
        Circulo circulo2 = new Circulo(6);
        Circulo circulo3 = new Circulo(5);

        Cuadrado cuadrado1 = new Cuadrado(8);
        Cuadrado cuadrado2 = new Cuadrado(1);
        Cuadrado cuadrado3 = new Cuadrado(8);

        circulo1.calcularArea();
        circulo2.calcularArea();
        circulo3.calcularArea();

        cuadrado1.calcularArea();
        cuadrado2.calcularArea();
        cuadrado3.calcularArea();

        if (circulo1.equals(circulo2) ){
            System.out.println("Circulo 1 y 2 son iguales.");
        }else{
            System.out.println("Circulo 1 y 2 no son iguales.");
        }

        if (circulo1.equals(circulo3)){
            System.out.println("Circulo 1 y 3 son iguales.");
        }else{
            System.out.println("Circulo 1 y 3 no son iguales.");
        }



        if (cuadrado1.equals(cuadrado2)){
            System.out.println("Cuadrado 1 y 2 son iguales.");
        }else{
            System.out.println("Cuadrado 1 y 2 no son iguales.");
        }

        if (cuadrado1.equals(cuadrado3)){
            System.out.println("Cuadrado 1 y 3 son iguales.");
        }else{
            System.out.println("Cuadrado 1 y 3 no son iguales.");
        }

    }
}

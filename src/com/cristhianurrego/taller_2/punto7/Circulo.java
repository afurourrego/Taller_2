package com.cristhianurrego.taller_2.punto7;

/**
 * Created by Afuro on 9/03/2017.
 */
public class Circulo extends Figura{
    private double Area;

    public Circulo(double dimensionPrincipal) {
        super(dimensionPrincipal);
        Area = 0f;
    }

    public void calcularArea(){

        this.Area = Math.PI*(Math.pow((this.dimensionPrincipal/2), 2));

        System.out.println("El area del circulo es: "+this.Area);
    }

    public double getArea() {
        return Area;
    }

     public boolean equals (Circulo circulo){

        return (this.dimensionPrincipal == circulo.dimensionPrincipal);
    }
}

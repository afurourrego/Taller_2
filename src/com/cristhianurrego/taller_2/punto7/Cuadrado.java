package com.cristhianurrego.taller_2.punto7;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Afuro on 9/03/2017.
 */
public class Cuadrado extends Figura {
    private double Area;

    public Cuadrado(double dimensionPrincipal) {
        super(dimensionPrincipal);
        this.Area = 0f;
    }

    public void calcularArea(){

        this.Area = Math.pow(this.dimensionPrincipal, 2);

        System.out.println("El area del cuadrado es: "+this.Area);
    }

    public boolean equals (Cuadrado cuadrado){

        return (this.dimensionPrincipal == cuadrado.dimensionPrincipal);
    }
}

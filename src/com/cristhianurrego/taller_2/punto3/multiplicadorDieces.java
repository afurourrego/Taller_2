package com.cristhianurrego.taller_2.punto3;

/**
 * Created by Afuro on 8/03/2017.
 */
public class multiplicadorDieces {

    private double NumeroMultiplicar;
    private int Multiplicador;

    public multiplicadorDieces() {
        NumeroMultiplicar = 0f;
        Multiplicador = 0;
    }

    public double multiplicadorDieces(double numeroMultiplicar, int multiplicador) {
        NumeroMultiplicar = numeroMultiplicar;
        Multiplicador = multiplicador;

        double Resultado = numeroMultiplicar*(Math.pow(10, multiplicador));

        return Resultado;
    }

}

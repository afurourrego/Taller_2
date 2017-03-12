package com.cristhianurrego.taller_2.punto9;

/**
 * Created by Afuro on 9/03/2017.
 */
public class CocinaCasa {
    protected boolean esIndependiente;
    protected int numeroDeFuegos;

    public CocinaCasa() {
        this.esIndependiente = false;
        this.numeroDeFuegos = 0;
    }

    public boolean getEsIndependiente() {
        return esIndependiente;
    }

    public void setEsIndependiente(boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }

    public int getNumeroDeFuegos() {
        return numeroDeFuegos;
    }

    public void setNumeroDeFuegos(int numeroDeFuegos) {
        this.numeroDeFuegos = numeroDeFuegos;
    }
}

package com.cristhianurrego.taller_2.punto9;

/**
 * Created by Afuro on 9/03/2017.
 */
public class SalonCasa {
    protected int numeroDeTelevisores;
    protected String tipoSalon;

    public SalonCasa() {
        this.numeroDeTelevisores = 0;
        this.tipoSalon = "desconocido";
    }

    public int getNumeroDeTelevisores() {
        return numeroDeTelevisores;
    }

    public void setNumeroDeTelevisores(int numeroDeTelevisores) {
        this.numeroDeTelevisores = numeroDeTelevisores;
    }

    public String getTipoSalon() {
        return tipoSalon;
    }

    public void setTipoSalon(String tipoSalon) {
        this.tipoSalon = tipoSalon;
    }
}

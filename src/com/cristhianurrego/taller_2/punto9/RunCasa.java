package com.cristhianurrego.taller_2.punto9;

/**
 * Created by Afuro on 9/03/2017.
 */
public class RunCasa {
    public static void main(String[] args) {

        Casa casita = new Casa(72, "Enseguida de mi vecino");

        System.out.println("INFORMACION CASA");
        System.out.println("Superficie: "+casita.getSuperficia());
        System.out.println("Direccion: "+casita.getDireccion());
        casita.getSalon();
        casita.getCocina();



    }
}

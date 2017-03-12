package com.cristhianurrego.taller_2.punto8;

import java.util.Date;

/**
 * Created by Afuro on 9/03/2017.
 */
public class ProductoCongelado extends Producto {

    private String TemperaturaRecomendada;

    public ProductoCongelado(String nombreProducto, String fechaCaducidad, String numeroLote, String temperaturaRecomentada) {
        super(nombreProducto, fechaCaducidad, numeroLote);
        TemperaturaRecomendada = temperaturaRecomentada;
    }

    public String getTemperaturaRecomentada() {
        return TemperaturaRecomendada;
    }

    public void setTemperaturaRecomentada(String temperaturaRecomentada) {
        TemperaturaRecomendada = temperaturaRecomentada;
        System.out.println("Actualziado..");
    }

    public void informacionProducto(){

        informacion();
        System.out.println("Temperatura Recomendada: "+TemperaturaRecomendada);

    }
}

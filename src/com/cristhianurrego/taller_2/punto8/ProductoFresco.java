package com.cristhianurrego.taller_2.punto8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Afuro on 9/03/2017.
 */
public class ProductoFresco extends Producto {
    private Date FechaEnvasado;
    private String PaisOrigen;

    public ProductoFresco(String nombreProducto, String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(nombreProducto, fechaCaducidad, numeroLote);

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            FechaEnvasado = df.parse(fechaEnvasado);
        } catch (ParseException e) {
            System.out.println("ERROR: Fecha Invalida");
        }
        NumeroLote = numeroLote;
        PaisOrigen = paisOrigen;
    }

    public Date getFechaEnvasado() {
        return FechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        FechaEnvasado = fechaEnvasado;
        System.out.println("Actualziado..");
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        PaisOrigen = paisOrigen;
        System.out.println("Actualziado..");
    }

    public void informacionProducto(){

        informacion();
        System.out.println("Fecha de Envasado: "+this.FechaEnvasado);
        System.out.println("Pais Origen: "+this.PaisOrigen);

    }
}

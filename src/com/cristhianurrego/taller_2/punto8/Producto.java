package com.cristhianurrego.taller_2.punto8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Afuro on 9/03/2017.
 */
public class Producto {
    protected String NombreProducto;
    protected Date FechaCaducidad;
    protected String NumeroLote;

    public Producto(String nombreProducto, String fechaCaducidad, String numeroLote) {

        NombreProducto = nombreProducto;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            FechaCaducidad = df.parse(fechaCaducidad);
        } catch (ParseException e) {
            System.out.println("ERROR: Fecha Invalida");
        }
        NumeroLote = numeroLote;
    }

    public Date getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        FechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return NumeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        NumeroLote = numeroLote;
        System.out.println("Actualziado..");
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
        System.out.println("Actualziado..");
    }

    public void informacion(){
        System.out.println("-INFORMACION PRODUCTO-");
        System.out.println("Nombre Producto: "+this.NombreProducto);
        System.out.println("Fecha Caducidad: "+this.FechaCaducidad);
        System.out.println("Numero de Lote: "+this.NumeroLote);
    }
}

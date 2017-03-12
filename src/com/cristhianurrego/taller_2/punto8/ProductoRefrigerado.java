package com.cristhianurrego.taller_2.punto8;

import java.util.Date;

/**
 * Created by Afuro on 9/03/2017.
 */
public class ProductoRefrigerado extends Producto {

    private String CodigoSupervision;

    public ProductoRefrigerado(String nombreProducto, String fechaCaducidad, String numeroLote, String codigoSupervision) {
        super(nombreProducto, fechaCaducidad, numeroLote);
        CodigoSupervision = codigoSupervision;
    }

    public String getCodigoSupervision() {
        return CodigoSupervision;
    }

    public void setCodigoSupervision(String codigoSupervision) {
        CodigoSupervision = codigoSupervision;
        System.out.println("Actualziado..");
    }

    public void informacionProducto(){

        informacion();
        System.out.println("Codigo de Supervision: "+CodigoSupervision);

    }
}

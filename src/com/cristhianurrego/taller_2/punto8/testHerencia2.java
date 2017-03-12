package com.cristhianurrego.taller_2.punto8;

/**
 * Created by Afuro on 9/03/2017.
 */
public class testHerencia2 {
    public static void main(String[] args) {

        ProductoCongelado producto1 = new ProductoCongelado("Hielo", "31/12/9999","151644","45c");

        ProductoFresco producto2 = new ProductoFresco("Agua","31/12/7777","43215","01/01/0001","Colombia");

        ProductoRefrigerado producto3 = new ProductoRefrigerado("Agua Fria","31/12/8888","21621","648779");

        producto1.informacionProducto();
        System.out.println();
        producto2.informacionProducto();
        System.out.println();
        producto3.informacionProducto();
    }
}

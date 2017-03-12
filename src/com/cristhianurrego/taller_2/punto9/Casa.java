package com.cristhianurrego.taller_2.punto9;

/**
 * Created by Afuro on 9/03/2017.
 */
public class Casa {
    private double Superficia;
    private String Direccion;
    private SalonCasa Salon;
    private CocinaCasa Cocina;

    public Casa(double superficia, String direccion) {
        Superficia = superficia;
        Direccion = direccion;
        Salon = new SalonCasa();
        Cocina = new CocinaCasa();
    }

    public double getSuperficia() {
        return Superficia;
    }

    public void setSuperficia(double superficia) {
        Superficia = superficia;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void getSalon() {
        System.out.println("Numero de Televisores: "+Salon.getNumeroDeTelevisores());
        System.out.println("Tipo Salon: "+Salon.getTipoSalon());
    }

    public void setSalon(SalonCasa salon) {
        Salon = salon;
    }

    public void getCocina() {
        System.out.println("Indispensable: "+Cocina.getEsIndependiente());
        System.out.println("Numero de fuegos: "+Cocina.getNumeroDeFuegos());
    }

    public void setCocina(CocinaCasa cocina) {
        Cocina = cocina;
    }
}

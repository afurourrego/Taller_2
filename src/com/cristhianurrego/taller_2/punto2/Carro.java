package com.cristhianurrego.taller_2.punto2;

/**
 * Created by Afuro on 6/03/2017.
 */
public class Carro {
    //definicion de atributos
    private String Marca;
    private String Modelo;
    private float ConsumoGasolina;
    private float Kilometraje;
    private float Gasolina;
    private boolean Movimiento;
    private double Velocidad;
    private boolean Luces;

    //creacion del constructor
    public Carro(String marca,String modelo,float consumogasolina ){
        this.Marca = marca;
        this.Modelo = modelo;
        this.ConsumoGasolina = consumogasolina;
        this.Kilometraje = 0f;
        this.Gasolina = 1f;
        this.Movimiento = false;
        this.Velocidad = 0f;
        this.Luces = false;
    }

    public String setModelo(String marcanueva, String modelonuevo){
        this.Marca = marcanueva;
        this.Modelo = modelonuevo;
        String mensaje = "Marca y Modelo actualizados";

        return mensaje;
    }

    public void Arrancar(){

        if (this.Gasolina > 0)
        {
            if (this.Movimiento != true){

                this.Movimiento = true;
                System.out.println("Esta vaina arranco");

            }else{

                System.out.println("ya habia arrancado ome");

            }
        }else{

            System.out.println("ERROR: sin combustible.");

        }
    }

    public void Frenar() {

        if (this.Velocidad > 0) {

            this.Velocidad = this.Velocidad * 0.75;
            System.out.println("velodicad actual: "+this.Velocidad);

        }
    }

    public void Acelerar(){

        if(this.Movimiento){

             if(this.Gasolina > 0){

                 this.Velocidad += 1;
                 this.Kilometraje += 1;
                 this.Gasolina -= ConsumoGasolina;

                 System.out.println("Acelerando...");

             }else{

                 System.out.println("No Tiene Gasolina");

             }

        }else{

            System.out.println("El carro no esta arrancado");

        }

    }

    public void getInformacionCarro(){

        String EstadoLuces;

        if (this.Luces){
            EstadoLuces = "Encendidas";
        }else{
            EstadoLuces = "Apagadas";
        }
        System.out.println("ESTADO CARRO");
        System.out.println("Valocidad: "+Velocidad);
        System.out.println("Gasolina: "+Gasolina);
        System.out.println("Kilometraje: "+Kilometraje);
        System.out.println("Luces: "+EstadoLuces);
    }

    public void EncenderLuces(){

        if (this.Luces){

            System.out.println("Ya estan encendidas las luces");

        }else{

            this.Luces = true;
            System.out.println("Encendiendo Luces");

        }
    }

    public void ApagarLuces(){

        if (this.Luces){

            this.Luces = false;
            System.out.println("Apagando Luces");

        }else{

            System.out.println("Ya estan apagadas las luces");

        }
    }

    public void ApagarCarro(){
        if (this.Velocidad == 0) {
            this.Movimiento = false;
            this.Luces = false;

            System.out.println("Apagando Vehiculo...");
        }
    }

    public void setTanquear(float gasolina){
        this.Gasolina = gasolina;

    }



}

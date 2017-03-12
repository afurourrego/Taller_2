package com.cristhianurrego.taller_2.punto4;

/**
 * Created by Afuro on 8/03/2017.
 */
public class Profesor {

    private String Nombre;
    private String Apellidos;
    private int Edad;
    private boolean Casado;
    private boolean Especialista;

    public Profesor(String nombre, String apellidos, int edad, boolean casado, boolean especialista) {
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
        this.Casado = casado;
        this.Especialista = especialista;
    }

    public Profesor() {
        this.Nombre = "NULL";
        this.Apellidos = "NULL";
        this.Edad = 0;
        this.Casado = false;
        this.Especialista = false;
    }

    public void setInformacionDocente(boolean especialista){
        this.Especialista = especialista;

        System.out.println("Informacion Actualizada");
    }

    public void setInformacionDocente(String nombre, String apellidos){
        this.Nombre = nombre;
        this.Apellidos = apellidos;

        System.out.println("Informacion Actualizada");
    }

    public void setInformacionDocente(int edad, boolean casado, boolean especialista){
        this.Edad = edad;
        this.Casado = casado;
        this.Especialista = especialista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public boolean getCasado() {
        return Casado;
    }

    public void setCasado(boolean casado) {
        Casado = casado;
    }

    public boolean getEspecialista() {
        return Especialista;
    }

    public void setEspecialista(boolean especialista) {
        Especialista = especialista;
    }
}

package com.cristhianurrego.taller_2.punto1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Afuro on 5/03/2017.
 */
public class Estudiante {

    private String Nombre;
    private String Apellido;
    private Date FechaNacimiento;

    public Estudiante(String nombre, String apellido, String fechaNacimiento) {
        this.Nombre = nombre;
        this.Apellido = apellido;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.FechaNacimiento = df.parse(fechaNacimiento);
        } catch (ParseException e) {
            System.out.println("ERROR: Campo fecha incorrecto");
        }
    }

    public void getNombreCompleto(){
        System.out.println("NOMBRE ESTUDIANTE");
        System.out.println(Nombre+" "+Apellido);
    }

    public String setNombreCompleto(String nombre, String apellido){
        this.Nombre = nombre;
        this.Nombre = apellido;

        String mensajeConfirmacion = "Nombre actualizado";

        return mensajeConfirmacion;
    }

    public  void getFechaNacimiento(){
        System.out.println("FECHA DE NACIMIENTO");
        System.out.println(FechaNacimiento);
    }

    public String setFechaNacimiento(Date fechaNacimiento){
        this.FechaNacimiento = fechaNacimiento;

        String mensajeConfirmacion = "Fecha de nacimiento actualizada";

        return mensajeConfirmacion;
    }

    public void getAnios() throws ParseException {

        Date date = new Date();
        Date fechaActual;

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        fechaActual = df.parse(dateFormat.format(date));

        System.out.println("Fecha: "+fechaActual);

/*        DateFormat fechaActual = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date Fechaaaaaaa = df.parse(fechaActual);

        System.out.println(fechaActual);
*/
    }
}

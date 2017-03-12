package com.cristhianurrego.taller_2.punto4;

/**
 * Created by Afuro on 10/03/2017.
 */
public class RunProfesor {
    public static void main(String[] args) {

        Profesor profe1 = new Profesor("el profe","con apellidos",00, false,true);

        Profesor profe2 = new Profesor();

        System.out.println();
        System.out.println("Nombre: "+profe1.getNombre());
        System.out.println("Nombre: "+profe1.getApellidos());
        System.out.println("Nombre: "+profe1.getEdad());
        System.out.println("Nombre: "+profe1.getCasado());
        System.out.println("Nombre: "+profe1.getEspecialista());

        System.out.println();
        System.out.println("Nombre: "+profe2.getNombre());
        System.out.println("Nombre: "+profe2.getApellidos());
        System.out.println("Nombre: "+profe2.getEdad());
        System.out.println("Nombre: "+profe2.getCasado());
        System.out.println("Nombre: "+profe2.getEspecialista());

        profe2.setInformacionDocente(true);
        profe2.setInformacionDocente("pepito","perez");
        profe2.setInformacionDocente(42,true,true);

        System.out.println();
        System.out.println("Nombre: "+profe2.getNombre());
        System.out.println("Nombre: "+profe2.getApellidos());
        System.out.println("Nombre: "+profe2.getEdad());
        System.out.println("Nombre: "+profe2.getCasado());
        System.out.println("Nombre: "+profe2.getEspecialista());
    }
}

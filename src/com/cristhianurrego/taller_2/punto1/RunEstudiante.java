package com.cristhianurrego.taller_2.punto1;

import java.text.ParseException;

/**
 * Created by Afuro on 5/03/2017.
 */
public class RunEstudiante {
    public static void main(String[] args) throws ParseException {
        Estudiante estudiante_1 = new Estudiante("pablito", "clavo", "10/02/2000");


        estudiante_1.getAnios();
    }
}

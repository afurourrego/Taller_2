package com.cristhianurrego.taller_2.punto5;

import java.util.Scanner;

/**
 * Created by Afuro on 10/03/2017.
 */
public class CompararPalabras {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("COMPARAR PALABRAS");
        System.out.println("Ingrese La palabra 1: ");

        String palabra1 = sc.nextLine();

        System.out.println("Ingrese La palabra 2: ");

        String palabra2 = sc.nextLine();

        //puntos suspensivos

        System.out.print("Cargando resultado");

        Thread.sleep(300);

        System.out.print(".");

        Thread.sleep(300);

        System.out.print(".");

        Thread.sleep(300);

        System.out.print(".");

        Thread.sleep(300);

        System.out.print("\n\n");

        // fin puntos suspensivos

        char[] CharPalabra1 = palabra1.toCharArray();
        char[] CharPalabra2 = palabra2.toCharArray();
        char[] PalabraCiclo;
        char[] PalabraMenor;

        if (CharPalabra1.length > CharPalabra2.length){
            PalabraCiclo = CharPalabra1;
            PalabraMenor = CharPalabra2;
        }else{
            PalabraCiclo = CharPalabra2;
            PalabraMenor = CharPalabra1;
        }

        for(int x=0 ; x <= PalabraCiclo.length ; x++ ){


            if (x < PalabraMenor.length)
            {
                if(CharPalabra1[x] == CharPalabra2[x])
                {
                    System.out.println("¿Letra "+(x+1)+" igual en las dos palabras? True");
                }
                else
                {
                    System.out.println("¿Letra "+(x+1)+" igual en las dos palabras? False");
                }
            }
            else if (x > CharPalabra1.length)
            {
                System.out.println("La palabra 1 no tiene letra "+x);
            }
            else if (x > CharPalabra2.length)
            {
                System.out.println("La palabra 2 no tiene letra "+x);
            }
        }
    }
}

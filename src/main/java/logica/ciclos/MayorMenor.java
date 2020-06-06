/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ciclos;

import java.util.Arrays;

/**
 *
 * @author jamsr
 */
public class MayorMenor {

    public static void main(String[] args) {
        // Declare and instatiate the Array
        int[] a = new int[5];
        // Set up the array
        a[0] = 2;
        a[1] = 5;
        a[2] = 4;
        a[3] = 1;
        a[4] = 3;
        // Create a variable and assign a temporary value
        int temporal = 0;
        // EL primer ciclo iterará del indice 0 al 4
        for (int index = 0; index <= a.length - 1; index++) {
            // i = 0; i <= 5 - 1; i++
            // El segundo ciclo iterará del 1 al 4 - el indice del primer ciclo
            for (int nextIndex = 1; nextIndex < (a.length - index); nextIndex++) {
                // nI = 1; nI < 5 - i; nI++
                if (a[nextIndex - 1] > a[nextIndex]) {
                    // if (a[nI - 1] > a[nI]
                    temporal = a[nextIndex - 1];
                    // temp = a[nI-1]; // Se asigna valor a temporal
                    a[nextIndex - 1] = a[nextIndex];
                    // a[nI-1] = a[nI] // Se intercambia el valor mayor a al indice anterior
                    a[nextIndex] = temporal; // Se pasa el valor del indice anterior al indice siguiente
                    // No se pierde el valor porque se le asigna a temporal y esa variable lo traspasa
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }

//        }
//// Sort: Ordena el arreglo de menor a mayor por default
//        Arrays.sort(numeros);
//        System.out.println("Menor a Mayor: ");
//        // Mediante un ciclo se accede a los valores de cada indice
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print(numeros[i]);
//        }
//
//        System.out.println("-------------");
//
//        Arrays.sort(numeros); // Por default es de menor a mayor
//        System.out.println("Mayor a Menor: ");
//        // Iteramos el ciclo de reversa, tomando el valor de lenght-1 como valor de indice
//        // Iterara del 5 al 0
//        for (int i = numeros.length - 1; i >= 0; i--) {
//            System.out.print(numeros[i]);
//        }
}

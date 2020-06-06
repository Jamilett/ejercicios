/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ciclos;

/**
 *
 * @author jamsr
 */
public class NumeroPrimo {

    public static void main(String[] args) {

        // Numero Primo: Aquel que es divisible entre la unidad y el mismo (2 divisores unicamente) 
        int numero = 2;
        int contador = 0;
        int divisor;

//        System.out.println("Divisores: ");
//
//        // El divisor comienza en la unidad y deberá ser menor o igual que el número a evaluar
//        for (divisor = 1; divisor <= numero; divisor++) {
//            // Validación del reciduo 0
//            // 2 / 1 = 2 (sin reciduo)           
//            if (numero % divisor == 0) { // Si la validación es true el contador ingrementa a 2
//                contador++; // 2/2 = 1 (sin reciduo) 
//                // Se imprimen los divisores (dentro de for)
//                System.out.println(divisor);
//            } // Cierre de if            
//        } // Cierre de for
//
//        // Validamos que el contador (numero de divisores) sea menor o igual a 2 (numero primo)
//        if (contador > 1 && contador <= 2) {
//            System.out.println("Resultado: " + "\n" + numero + " es número PRIMO");
//        } else {
//            System.out.println("Resultado: " + "\n" + numero + " NO es número PRIMO");
//        }
//
        int inicio = 0;
        int fin = 100;
        boolean esPrimo;
        // Ciclo for para delimitar inicio y fin de iteración
        for (int i = inicio; i <= fin; i++) {
            // Se inicializa la variable esPrimo en true
            esPrimo = true; // Todos los numeros son divisibles entre ellos mismos y la unidad
            //Ciclo for anidado para revisar divisores != ellos mismos y la unidad
            for (int j = 2; j < i; j++) {
                // Validación para saber si nuestro numero es divisible entre otros divisores
                if (i % j == 0) {
                    // Si es true, cambiamos el valor de esPrimo a false, ya que un numero primo NO tiene más de 2 divisores
                    esPrimo = false;
                }
            }
            if (esPrimo) { // Si es primo, se imprime
                System.out.println(i);
            }
        }

    }

}

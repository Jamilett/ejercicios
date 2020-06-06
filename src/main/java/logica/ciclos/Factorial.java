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
public class Factorial {

    public static void main(String[] args) {

        int numero = 5;

        int factorial = 1;

        // Opción 1: (Simple)
        for (int i = 1; i <= numero; i++) { // i será el contador de 1 a 5
            factorial = factorial * i;
            // Hará lo siguiente:
            // (i)(factorial) = factorial
            // 1*1 = 1 (Fac1)
            // 2*1 = 2 (Fac2)
            // 3*2 = 6 (Fac3)
            // 4*6 = 24 (Fac4)
            // 5*24 = 120 (Fac5)
            System.out.println("Factorial " + i + " de " + numero + "-----> " + factorial);
        }

        // Opción 2: Decremento y formula:
        int contador; // funcionará como el factorial en reversa
        int nMenosUnoPorN = (numero - 1) * numero; // Formula: (5-1)*5 = 20

        // Ciclo para obtener factoriales
        // Contador valdrá numero - 2 porque en nMenosUnoPorN ya hicimos el primer decremento
        // El contador debe ser mayor o igual a 1, para que no multiplique por 0
        for (contador = numero - 2; contador >= 1; contador--) {
            nMenosUnoPorN = nMenosUnoPorN * contador;
            // 20*3 = 60
            // 60*2 = 120
            // 120*1 = 120
        }

        System.out.println("Factorial Final de: " + numero + " ----> " + nMenosUnoPorN);
    }
}

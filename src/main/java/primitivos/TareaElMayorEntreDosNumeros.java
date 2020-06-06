/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivos;

import java.util.Scanner;

/**
 *
 * @author jamsr
 */
public class TareaElMayorEntreDosNumeros {
    
// Solicitar al usuario dos valores: // numero1 (int) // numero2 (int)
// Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):
    
// Proporciona el numero1:
// Proporciona el numero2:
// El numero mayor es:
// <numeroMayor>
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println ("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        
// OPCION 1: (TERNARIO)

        String resultado = (numero1 > numero2) ? "El numero mayor es: " + numero1 : "El numero mayor es: " + numero2;
        System.out.println(resultado);
        
//OPCION 2: (IF)

        if (numero1 > numero2) {
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }

        
        
       
    }
    
}

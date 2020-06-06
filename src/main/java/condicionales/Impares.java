package condicionales;

import java.util.Scanner;

public class Impares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // El usuario proporcionará rango a evaluar
        // Si el valor final es menor que el valor inicial: ERROR
        // Imprimir números impares del rango proporcionado
        
        System.out.println("Escribe el rango a inicial a evaluar: ");
        int inicio = Integer.parseInt(scanner.nextLine());

        System.out.println("Escribe el rango final a evaluar: ");
        int fin = Integer.parseInt(scanner.nextLine());
        
       
        if (inicio > fin) {
            System.out.println("Valor Incorrecto");
        }

        for (int i = inicio; i <= fin; i++) { // Asignamos el valor de inicio a una nueva variable

            if (i % 2 != 0) {
                System.out.println("i = " + i); // imprime impares
            }

        }

    }

}

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
public class TareaTiendaDeLibros {

    public static void main(String[] args) {
        // TAREA TIENDA DE LIBROS
        Scanner scanner = new Scanner(System.in); // El valor lo trae de la consola

        System.out.println("Proporciona el Nombre:"); // Para mostrar al usuario, debe ir antes del nextLine
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el ID:");
        var iD = Integer.parseInt(scanner.nextLine()); // Convierte la cadena de texto a entero en la consola
        System.out.println("iD = " + iD);

        System.out.println("Proporciona Precio:");
        var precio = Double.parseDouble(scanner.nextLine()); // Convierte la cadena de texto a double en la consola
        System.out.println("precio = " + precio);

        System.out.println("Proporciona Caracter:");
        char caracter2 = scanner.nextLine().charAt(0);
        System.out.println("caracter2 = " + caracter2);

        System.out.println("Proporciona el Envío Gratuito");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("envioGratuito = " + envioGratuito);

        System.out.println(nombre + " # " + iD + "\n" + "Precio: " + caracter2 + precio + "\n" + "Envío Gratuito: " + envioGratuito);

    }



}

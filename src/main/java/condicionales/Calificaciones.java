package condicionales;

import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");

        double numero = Double.parseDouble(scanner.nextLine());

        String calificacion = "Valor Desconocido";

        if (numero <= 10 && numero >= 9) {
            calificacion = "A";
        } else if (numero < 9 && numero >= 8) {
            calificacion = "B";
        } else if (numero < 8 && numero >= 7) {
            calificacion = "C";
        } else if (numero < 7 && numero >= 6) {
            calificacion = "D";
        } else if (numero < 6 && numero >= 0) {
            calificacion = "F";
        } else {
            System.out.println("Valor Desconocido");
        }
        System.out.println("calificacion = " + calificacion);

            }

}

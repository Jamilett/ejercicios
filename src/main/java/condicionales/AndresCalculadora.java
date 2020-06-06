package condicionales;


import java.util.Scanner;

public class AndresCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + " ¿Deseas hacer una operación?" + "\n" + "Selecciona 1 o 2");
        System.out.println("1 = si" + "\n" + "2 = no");
        int opcion = Integer.parseInt(scanner.nextLine());

        // Variables para operaciones
        double numero1;
        double numero2;
        double resultado;

        if (opcion == 1) {

            System.out.println("Selecciona 1, 2, 3 o 4");
            System.out.println("¿Que tipo de operacion?" + "\n" + "1 = suma" + "\n" + "2 = resta" + "\n" + "3 = multiplicación" + "\n" + "4 = división");
            int operacion = Integer.parseInt(scanner.nextLine());

            System.out.println("Inserta valor de Número1: ");
            numero1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Inserta valor de Número2");
            numero2 = Double.parseDouble(scanner.nextLine());

            // Si selecciona Suma
            if (operacion == 1) {

                resultado = numero1 + numero2;
                System.out.println("Resultado Suma = " + resultado);

                // Validar si el ResultadoSuma es PAR o IMPAR
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " es número PAR");
                } else {
                    System.out.println(resultado + " es número IMPAR");
                }
            } // Si Selecciona Resta
            else if (operacion == 2) {

                resultado = numero1 - numero2;
                System.out.println("Resultado Resta = " + resultado);

                // Validar si el ResultadoResta es PAR o IMPAR
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " es número PAR");
                } else {
                    System.out.println(resultado + " es número IMPAR");
                }
            } // Si selecciona Multiplicación
            else if (operacion == 3) {

                resultado = numero1 * numero2;
                System.out.println("Resultado Multiplicación = " + resultado);

                // Validar si el ResultadoMultiplicación es PAR o IMPAR
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " es número PAR");
                } else {
                    System.out.println(resultado + " es número IMPAR");
                }
            } // Si selecciona División
            else if (operacion == 4) {

                resultado = numero1 / numero2;
                System.out.println("Resultado División = " + resultado);

                // Validar si el ResultadoDivisión es PAR o IMPAR
                if (resultado % 2 == 0) {
                    System.out.println(resultado + " es número PAR");
                } else {
                    System.out.println(resultado + " es número IMPAR");
                }
            } else {
                System.out.println("Escoge una opcion del 1 al 4.");
            }

        } else {
            System.out.println("Ok, que tengas lindo día " + nombre);
        }

    }

}

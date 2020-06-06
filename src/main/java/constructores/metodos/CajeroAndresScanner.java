package constructores.metodos;

import java.util.Scanner;

public class CajeroAndresScanner {
// Variables GLOBALES para usarlas en todos los metodos:

    private String nombre = "";
    private String cuenta = "";
    public static final double SALDO = 1500.00; // CONSTANTE: El valor siempre será el mismo
    Scanner scanner = new Scanner(System.in); // Solo declaramos Scanner una vez para usarlo en todos los metodos

    public void saludar() {

        System.out.println("Proporciona tu nombre: ");
        String nombreScanner = scanner.nextLine();
        System.out.println("Bienvenido " + nombreScanner);
        nombre = nombreScanner; // Se le asigna el valor a la variable global nombre

    }

    public void pedirCuenta() {

        System.out.println("Ingresa tu numero de cuenta: ");
        String cuentaScanner = scanner.nextLine();
        cuenta = cuentaScanner; // // Se le asigna el valor a la variable global cuenta

    }

    public void crearCuenta() {
        System.out.println(nombre + " se ha creado tu numero de cuenta #" + cuenta + " con un saldo de $ " + SALDO);

    }

    public void retiros() {

        System.out.println("¿Deseas hacer un retiro?" + "\n" + "1 = SI / 2 = NO");
        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Ingresa la cantidad que deseas retirar: ");
                double cantidad = Double.parseDouble(scanner.nextLine());

                if (cantidad > 1500) {
                    System.out.println("Ingresa una cantidad menor o igual a $1,500.00 MXN");
                } else {
                    double retiro = SALDO - cantidad;
                    System.out.println("Tu saldo actual es de: " + retiro);
                }
                break;
            case 2:
                System.out.println("Ok, ¡Que tengas lindo día " + nombre + "!");
                break;
           
            default: 
                System.out.println("Opción Inválida");

        }

    }

}

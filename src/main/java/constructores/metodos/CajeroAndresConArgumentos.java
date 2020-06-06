package constructores.metodos;

public class CajeroAndresConArgumentos {

    // Variables GLOBALES para usarlas en todos los metodos:
    private String nombre = "";
    private String cuenta = "";
    public static final double SALDO = 1500.00; // CONSTANTE: El valor siempre será el mismo

    public void saludar(String nombreCliente) {

        System.out.println("Bienvenido " + nombreCliente);
        nombre = nombreCliente; // Se le asigna el valor a la variable global nombre

    }

    public void pedirCuenta(String cuentaCliente) {

        cuenta = cuentaCliente; // // Se le asigna el valor a la variable global cuenta

    }

    public void crearCuenta() {
        System.out.println(nombre + " se ha creado tu numero de cuenta #" + cuenta + " con un saldo de $ " + SALDO);

    }

    public void retiros(int opcion, double cantidadARetirar) {

        if (opcion == 1) {

            double cantidad = cantidadARetirar;

            if (cantidad > 1500) {
                System.out.println("Ingresa una cantidad menor o igual a $1,500.00 MXN");
            } else {
                double retiro = SALDO - cantidad;
                System.out.println("Tu saldo actual es de: " + retiro);
            }

        } else {
            System.out.println("Ok, ¡Que tengas lindo día " + nombre + "!");
        }

    }

}

package constructores.metodos;


public class AritmeticaMain {

    public static void main(String[] args) {

        // Crear objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        //Declaramos la variable resultado a la q se le asigna el valor del metodo
        // Declaramos la variable porque en el metodo definimos que regresaría un valor int
        int resultado = aritmetica.sumar(5, 3);
        // Se imprime lo que mandamos a imprimir en el método

        // EJEMPLO 2: Llamamos al metodo operacion final para sumar y restar:
        // Creamos y nombramos el objeto de la clase aritmetica 
        Aritmetica ejercicio = new Aritmetica();
        // mandamos llamar el método
        ejercicio.operacionFinal(10, 30, 15);
        // Imprimirá lo que se configuró dentro del metodo operacion final

    }
}

package logica.ciclos;

/**
 *
 * @author jamsr
 */
public class Fibonacci {

    public static void main(String[] args) {

        int limite = 10; // Variable límite de iteraciones
        int x = 0; // Primer valor fijo en la 1ra iteracion
        int y = 1; // Segundo valor fijo en la 1ra iteracion
        int current; // Variable que cambiará su valor conforme al inicio

        for (int i = 1; i <= limite; i++) {
            // PRIMERA ITERACIÓN
            // current = x(0);
            // x = y(1) + x(0);
            // y = current(0); // y cambia su valor a 0
            // SEGUNDA ITERACIÓN
            // current = x(1);
            // x = y(0) + x(1);
            // y = current(1); // regresa su valor 1 
            // TERCERA ITERACIÓN
            // current = x(1);
            // x = y(1) + x(1);
            // y = current(1);
            // CUARTA ITERACIÓN
            // current = x(2);
            // x = y(1) + x(2);
            // y = current(2);
            // QUINTA ITERACIÓN
            // current = x(3);
            // x = y(2) + x(3);
            // y = current(3);
            current = x; // Iniciara el valor current con el inicio anterior
            x = y + x; // x será el nuevo valor
            y = current; // y será el nuevo valor de current y cambiará al iterar el ciclo nuevamente

            System.out.print(x + ", ");

        }

    }

}

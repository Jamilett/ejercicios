package constructores.metodos;


public class Aritmetica {

    public int sumar(int a, int b) { // Se le conoce como firma del método

        int resultadoSuma = a + b;
        System.out.println("El resultado de la suma es = " + resultadoSuma);
        return resultadoSuma;
    }

    public void operacionFinal(int a, int b, int c) {

        int resultadoOperacion1 = sumar(a, b);

        int resultado = resultadoOperacion1 - c;
        System.out.println("El resultado de la operacion Final es = " + resultado);
        
        // No usamos Return porque el método no nos regresará nungun tipo de dato
    }

}

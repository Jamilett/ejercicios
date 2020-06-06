package constructores.metodos;

public class EjercicioSuma {

    private double numero1Clase;
    private double numero2Clase;
    private double resultadoClase;

    public EjercicioSuma(double numero1, double numero2) {
        numero1Clase = numero1;
        numero2Clase = numero2;
    }

    public void sumar() {
        resultadoClase = numero1Clase + numero2Clase;

    }

    public void mostrarResultado() {
        System.out.println("Resultado: " + resultadoClase);
    }

}

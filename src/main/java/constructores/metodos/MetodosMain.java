package constructores.metodos;


public class MetodosMain {

    public static void main(String[] args) {


        Metodos obj = new Metodos();
// Declaramos variable promedio (tipo de dato String debe coincidir con el del metodo que usemos)
// Accedemos mediante el punto a los atributos 
// Escribimos los parametros a evaluar de tipo double
        String promedio = obj.obtenerPromedio(9.0, 8.6, 7.4);
// Imprimirá el resultado del promedio + la clasificación conforme a la validación de if
        System.out.println(promedio);

    }

}

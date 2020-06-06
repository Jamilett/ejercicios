package constructores.metodos;


public class Metodos {

    // Método private para que sólo se use en ésta clase
    private double sumarCalificacionesDeMaterias(Double calificacionEspañol, Double calificacionMatematicas, Double calificacionGeografia) {
        Double resultadoSuma = calificacionEspañol + calificacionMatematicas + calificacionGeografia;
        return resultadoSuma; // Como declaramos que regresará un tipo de dato, se usa Return
    }

    // Declaramos un segundo método para obtener promedio del metodo suma // Sin modificador de acceso
    // El tipo de dato en los argumentos NO depende del tipo de dato declarado y viceversa
    String obtenerPromedio(Double calificacionEspañol, Double calificacionMatematicas, Double calificacionGeografia) {
        // Declaramos variable resultado y le asignamos el valor del método suma de calificaciones   
        Double resultadoCalificaciones = sumarCalificacionesDeMaterias(calificacionEspañol, calificacionMatematicas, calificacionGeografia);
        // Declaramos variable promedio y hacemos la división correspondiente tomando el valor de la variable resultado
        Double promedioFinal = resultadoCalificaciones / 3;
        // Mandamos a imprimir el promedio double
        System.out.println("Promedio Final = " + promedioFinal);
        // Clasificamos y Redondeamos los resultados:
        if (promedioFinal <= 6.9) { // Si es menor o igual a 6.9
            return "Reprobado por BURRO"; // Aplicamos return en cada validación
        } else { // Si es mayor a 6.9 validamos nuevamente para clasificar:
            if (promedioFinal <= 7.4) {
                return "Aprobado con 7";
            } 
            else if (promedioFinal >= 7.5 && promedioFinal <= 8.4) {
                return "Aprobado con 8";
            } 
            else if (promedioFinal >= 8.5 && promedioFinal <= 9.4) {
                return "Aprobado con 9";
            } 
            else { // Si es mayor a 9.5:
                return "Aprobado con 10";
            }
// Mandamos llamar al método en Prueba Creacion Metodos
        }

    }

}

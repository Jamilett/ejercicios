package constructores.metodos;


public class ConcatenandoCadenas {

    private String cadena1(String cadenaA) { // Private poque no se usará en otra clase
        return cadenaA.toUpperCase(); // Convierte Valor String a Mayusculas
    }

    private String cadena2(String cadenaB) { // Private poque no se usará en otra clase
        return cadenaB.toLowerCase(); // Convierte Valor String a Minusculas
    }

    public void cadenaFinal(String a, String b) { // Public para acceder al método en la clase Pueba Concatenando
        String cadenaFinal = cadena1(a) + " " + cadena2(b);
        System.out.println("Tu cadena final es: " + cadenaFinal);
    }

}

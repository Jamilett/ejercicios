package constructores.metodos;

public class Caja {
    
    // Atributos Globales:
    private int ancho;
    private int alto;
    private int profundo;
    
    // Constructor Vacío:
    public Caja (){
        
    }
    
    // Constructor 3 argumentos:
    public Caja (int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // Metodo volumen:
    public void calcularVolumen (){
        int volumen = ancho * alto * profundo;
        System.out.println("volumen = " + volumen);
    }

}

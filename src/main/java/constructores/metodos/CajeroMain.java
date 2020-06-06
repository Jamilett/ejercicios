package constructores.metodos;

public class CajeroMain {

    public static void main(String[] args) {

        // Crear objeto para cajero Jesus
//        MetodosConScanner cajeroJesus = new MetodosConScanner();
//        cajeroJesus.saludar();
//        cajeroJesus.pedirCuenta();
//        cajeroJesus.crearCuenta();
//        cajeroJesus.retiros();
        
        //Crear objeto para cajero Andres
//        MetodosConScanner cajeroAndres = new MetodosConScanner();
//        cajeroAndres.saludar();
//        cajeroAndres.pedirCuenta();
//        cajeroAndres.crearCuenta();
//        cajeroAndres.retiros();
        
//         Crear objeto con argumentos
        CajeroAndresConArgumentos cajeroArgumentos = new CajeroAndresConArgumentos();
        cajeroArgumentos.saludar("Andres");
        cajeroArgumentos.pedirCuenta("2033-5456-7654-0987");
        cajeroArgumentos.crearCuenta();
        cajeroArgumentos.retiros(3, 751.74);
        

    }

}

package constructores.metodos;

public class HoraMain {

    public static void main(String[] args) {

        Hora obj1 = new Hora(23, 10, 30);
        obj1.defineFormato("12");
        obj1.dameHora();

    }

}

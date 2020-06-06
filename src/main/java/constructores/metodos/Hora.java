package constructores.metodos;

public class Hora {

    private int hora;
    private int minuto;
    private int segundo;
    private String horaFinal;
    public static final String AM_PM = "12";
    public static final String VEINTICUATRO = "24";
    private String tipoFormatoHora;

// Ingresa Hora:
    public Hora() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    private boolean compruebaHora() {
// Validar si los datos ingresados entran dentro del rango hora (24 horas)

        boolean horaCorrecta;
        boolean minutoCorrecto;
        boolean segundoCorrecto;

        if (hora <= 24 && hora >= 0) {
            horaCorrecta = true;
        } else {
            horaCorrecta = false;
            System.out.println("ERROR HORA: Ingrese un valor correcto en formato de 24 horas");
        }
        if (minuto <= 59 && minuto >= 0) {
            minutoCorrecto = true;
        } else {
            minutoCorrecto = false;
            System.out.println("ERROR MINUTO: Ingresa un valor correcto de 0 a 59");
        }
        if (segundo <= 59 && segundo >= 0) {
            segundoCorrecto = true;
        } else {
            segundoCorrecto = false;
            System.out.println("ERROR SEGUNDO: Ingresa un valor correcto de 0 a 59");
        }

        if (horaCorrecta && minutoCorrecto && segundoCorrecto) {
            return true;
        } else {
            return false;
        }
    }

    public void defineFormato(String tipoFormato) {

        if (tipoFormato.equals(AM_PM)) {
            tipoFormatoHora = AM_PM;
        } else if (tipoFormato.equals(VEINTICUATRO)) {
            tipoFormatoHora = VEINTICUATRO;
        } else {
            System.out.println("Tipo de Formato Incorrecto, elige 12 o 24");
            tipoFormatoHora = "ERROR";
        }

    }

    // Mostrar la hora en el formato seleccionado:
    public void dameHora() {
        int horaAmPm;

        if (compruebaHora()) {

            if (tipoFormatoHora.equals(AM_PM)) {

                if (hora >= 13 && hora <= 24) {
                    horaAmPm = hora - 12;
                    horaFinal = horaAmPm + ":" + minuto + ":" + segundo + " PM";
                } else {
                    horaAmPm = hora;
                    horaFinal = horaAmPm + ":" + minuto + ":" + segundo + " AM";
                }

            } else if (tipoFormatoHora.equals(VEINTICUATRO)) {
                horaFinal = hora + ":" + minuto + ":" + segundo;
            }

            System.out.println("La hora es: " + horaFinal);
            
        } else {
            System.out.println("La hora que ingresaste es incorrecta");
        }

    }

}

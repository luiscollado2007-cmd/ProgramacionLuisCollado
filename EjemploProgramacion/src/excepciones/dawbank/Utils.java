package excepciones.dawbank;

import java.time.LocalDateTime;

public class Utils {

    public static final String VALOR_SI = "SÍ";
    public static final String VALOR_NO = "NO";

    /**
     * Devuelve una cadena de caracteres que representa
     * a la fecha en formato español (dd-MM-yyyy)
     * @param fechaHora
     * @return
     */
    public static String formatearFecha(LocalDateTime fechaHora){
        int anyo = fechaHora.getYear();
        int mes = fechaHora.getMonthValue();
        int dia = fechaHora.getDayOfMonth();
        return (dia + "/" + mes + "/" + anyo);
    }

    /**
     * Devuelve "SI" si el valor pasado por parametro es true, "NO" en caso contrario
     * @param valor Valor booleano que quremos convertir a cadena
     * @return Cadena "SI" o "NO"
     */
    public static String convertirBooleanAString(boolean valor){
        return valor ? VALOR_SI : VALOR_NO;
    }

}
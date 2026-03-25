package poo.dawbank;

import java.time.LocalDateTime;

public class Utils {
    private final static String VALOR_SI = "SI";
    private final static String VALOR_NO = "NO";
    /**
     * Devuelve una cadena de caracteres que representa
     * a la fecha en formato español(dd-MM-yyyy)
     * @param fecha
     * @return
     */
    public static String formatearFecha(LocalDateTime fecha){
        int anyo = fecha.getYear();
        int mes = fecha.getMonthValue();
        int dia = fecha.getDayOfMonth();
        return (dia + "/" + mes + "/" + anyo);
    }

    /**
     * Devuelve "SI" si el valor pasado por parametro es true, "NO"
     */
    public static String convertirValorBooleanAString(boolean valor){
        /*
        if(valor){
            return "SI";
        }else{
            return "NO"
        }
         */
        return valor ? VALOR_SI : VALOR_NO;
    }
}

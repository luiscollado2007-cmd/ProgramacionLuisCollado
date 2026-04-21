package fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDate {

    public static void main(String[] args) {

        /**
         * Primer Ejercicio
         */
        LocalDate miFechaNac =  LocalDate.of(2007,4,10);
        System.out.println(miFechaNac);

        LocalDate fecha = LocalDate.now().minusDays(11).minusYears(19);
        System.out.println(fecha);

        LocalDate otraFecha = LocalDate.now().withDayOfMonth(10).withMonth(4).withYear(2007);
        System.out.println(otraFecha);

        /**
         * Segundo Ejercicio
         */

        LocalDate fechaBro = LocalDate.of(2007,8,2);

        System.out.println("Es más mayor mi amigo que yo? " + (miFechaNac.isAfter(fechaBro) ? "SI" : "NO"));


        /**
         * Tercer ejercicio
         */

        System.out.println("Nací el día " + miFechaNac.getDayOfMonth() + " del mes " + miFechaNac.getMonthValue() + " del año " + miFechaNac.getYear());

        System.out.println("Nací el " + miFechaNac.getDayOfWeek() + " en el mes de " + miFechaNac.getMonth() + " del año " + miFechaNac.getYear());


        /**
         * Cuarto Ejercicio
         */

        String primerString = "25/10/1998";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate w = LocalDate.parse(primerString,formateador);
        System.out.println("La primera fecha es: " + w.format(formateador));


        String segundoString = "10/25/1998";
        DateTimeFormatter wde = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate y = LocalDate.parse(segundoString,wde);
        System.out.println("La primera fecha es: " + y.format(wde));


        String tercerString = "25-oct-98";
        DateTimeFormatter ghy = DateTimeFormatter.ofPattern("dd-MMM-yy");
        LocalDate h = LocalDate.parse(tercerString,ghy);
        System.out.println("La primera fecha es: " + h.format(ghy));


        String cuartoString = "1998,oct,25";
        DateTimeFormatter kjl = DateTimeFormatter.ofPattern("yyyy,MMM,dd");
        LocalDate p = LocalDate.parse(cuartoString,kjl);
        System.out.println("La primera fecha es: " + p.format(kjl));
    }
}

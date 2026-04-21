package fechas;

import java.time.LocalTime;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime miHora = LocalTime.of(20,30);
        System.out.println(miHora);

        LocalTime unaHora = LocalTime.now().plusHours(10).plusMinutes(15);
        System.out.println(unaHora);

        LocalTime otraHora = LocalTime.now().withHour(20).withMinute(30);
        System.out.println(otraHora);

        LocalTime horaCenaBro = LocalTime.of(21,23);

        System.out.println("Mi amigo cenó después de mi? " + (miHora.isBefore(horaCenaBro) ? "SI" : "NO"));


    }
}

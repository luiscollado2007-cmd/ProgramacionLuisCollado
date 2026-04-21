package fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploFechas {

    public static void main(String[] args) {

        LocalDate fechaRegresoAlFuturo = LocalDate.of(1985,5,3);
        System.out.println(fechaRegresoAlFuturo);

        fechaRegresoAlFuturo = fechaRegresoAlFuturo.withMonth(12);

        if (fechaRegresoAlFuturo.getMonth() == Month.DECEMBER){
            System.out.println("FELIZ NAVIDAD...");
        }else{
            System.out.println("No es navidad...");
        }

        String fechaNacimiento = "11/10/2001";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento,formateador);

        System.out.println("La fecha de nacimiento es: " + fechaNac.format(formateador));
    }
}

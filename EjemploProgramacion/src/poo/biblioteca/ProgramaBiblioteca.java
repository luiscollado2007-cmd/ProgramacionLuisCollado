package poo.biblioteca;

import java.time.LocalDateTime;

public class ProgramaBiblioteca{

    public static void main(String[] args) {

        Libro soledad = new Libro("Cien años de soledad","978-03307455290",464,
                "Novela mágica");
        Libro orgullo = new Libro("Orgullo y prejuicio","978-0486284736",256,
                " Novela romántica");

        Libro libro1984 = new Libro("1984","978-0451524935",336,"Distopía");


        Autor gabriel = new Autor("Gabriel", "García Márquez","Colombiana",1929);

        Autor orwell = new Autor("George", "Orwell","Británico",1903);

        soledad.setEscritor(gabriel);

        orgullo.setEscritor(gabriel);

        libro1984.setEscritor(orwell);

        System.out.println(soledad);
        System.out.println();
        System.out.println(orgullo);
        System.out.println();
        System.out.println(libro1984);

        System.out.println("La nacionalidad del autor de Cien Años de Soledad es....");
        String nacionalidadSoledad = soledad.getEscritor().getNacionalidad();
        System.out.println(nacionalidadSoledad);

        //Mostrar el año de nacimiento del autor de 1984

        System.out.println("El año de nacimiento del autor de 1984 es.....");
        System.out.println(libro1984.getEscritor().getAnyoNacimiento());

        //Mostrar el género de Orgullo y Prejuicio
        System.out.println("El género del libro Orgullo y Prejuicio es..." + orgullo.getGenero());

        //Mostrar la media de páginas entre los 3 libros
        int sumaPaginasTotales = soledad.getNumPaginas() + orgullo.getNumPaginas() + libro1984.getNumPaginas();
        double mediaPaginasTotales = (double) sumaPaginasTotales / 3;
        System.out.println("La media de páginas entre los tres libros es...." + mediaPaginasTotales);


        //Mostrar la media de edades de los autores de los 3 libros. Considerando el año actual.
        int sumaTotalEdad = (calcularEdadSegunAnyoNacimiento(soledad.getEscritor().getAnyoNacimiento())) +
                (calcularEdadSegunAnyoNacimiento(orgullo.getEscritor().getAnyoNacimiento()))
                + (calcularEdadSegunAnyoNacimiento(libro1984.getEscritor().getAnyoNacimiento()));
        double mediaTotalEdad = (double) sumaTotalEdad / 3;
        System.out.println("La media de edades entre los tres autores es...." + mediaTotalEdad);

    }

    private static int calcularEdadSegunAnyoNacimiento(int anyoNacimiento){
        int anyoActual = LocalDateTime.now().getYear();
        return anyoActual - anyoNacimiento;
    }
}

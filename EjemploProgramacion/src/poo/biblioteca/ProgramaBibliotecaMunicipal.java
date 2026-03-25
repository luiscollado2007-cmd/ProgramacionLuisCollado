package poo.biblioteca;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProgramaBibliotecaMunicipal{

    public static void main(String[] args) {
        Biblioteca biblioLeganes = new Biblioteca("Biblioteca Pio Baroja","Avda Mediterráneo");

        cargarLibrosReales(biblioLeganes);

        biblioLeganes.mostrarCatalogo();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime las máximas paginas y busco los libros que no se pasen de esa cantidad");
        int maxPaginas = teclado.nextInt();
        teclado.nextLine();
        biblioLeganes.mostrarLibroPorMaxPaginas(maxPaginas);

        System.out.println("Dime nacionalidad y te digo qué autores existen en el catálogo con esa nacionalidad");
        String nac = teclado.nextLine();

        biblioLeganes.mostrarAutoresPorNacionalidad(nac);
    }
    public static void cargarLibrosReales(Biblioteca miBiblioteca) {
        // Definimos arrays con datos reales para facilitar la creación
        String[] titulos = {
                "Cien años de soledad", "1984", "El Quijote", "El resplandor",
                "Crimen y castigo", "El principito", "El Hobbit", "Crónica de una muerte anunciada",
                "Fahrenheit 451", "La sombra del viento"
        };

        String[] isbns = {
                "978-0307350435", "978-0451524935", "978-8424116286", "978-0307743657",
                "978-0140449136", "978-0156012195", "978-0547928227", "978-1400034956",
                "978-1451673319", "978-8408079545"
        };

        Autor[] autores = {
                new Autor("Gabriel", "García Márquez", "Colombiana", 1927),
                new Autor("George", "Orwell", "Británica", 1903),
                new Autor("Miguel", "de Cervantes", "Española", 1547),
                new Autor("Stephen", "King", "Estadounidense", 1947),
                new Autor("Fiódor", "Dostoievski", "Rusa", 1821),
                new Autor("Antoine", "de Saint-Exupéry", "Francesa", 1900),
                new Autor("J.R.R.", "Tolkien", "Británica", 1892),
                new Autor("Gabriel", "García Márquez", "Colombiana", 1927),


                new Autor("Ray", "Bradbury", "Estadounidense", 1920),
                new Autor("Carlos", "Ruiz Zafón", "Española", 1964)
        };

        int[] paginas = {496, 328, 1080, 688, 672, 96, 310, 150, 256, 576};
        String[] generos = {"Realismo Mágico", "Distopía", "Clásico", "Terror", "Psicológico", "Infantil", "Fantasía", "Novela", "Ciencia Ficción", "Misterio"};

        for (int i = 0; i < 10; i++) {
            Libro libro = new Libro(titulos[i], isbns[i], paginas[i], generos[i], autores[i]);
            miBiblioteca.anyadirLibro(libro);
        }
    }
}

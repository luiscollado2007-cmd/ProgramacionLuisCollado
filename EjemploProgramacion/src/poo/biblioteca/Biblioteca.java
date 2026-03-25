package poo.biblioteca;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private Libro[] catalogo;
    public static int MAX_LIBROS = 10;
    private int posicionProxLibro = 0;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new Libro[MAX_LIBROS];
    }

    public void anyadirLibro(Libro nuevo){
        //si no está lleno el array, puedo meter el libro
        if (posicionProxLibro != MAX_LIBROS){
            catalogo[posicionProxLibro] = nuevo;
            posicionProxLibro++;
        }else{
            //está lleno
            System.out.println("Lo siento, el catálogo está lleno");
        }
    }

    public void mostrarCatalogo(){
        System.out.println(" *** CATÁLOGO DE LIBROS DE LA BIBLIOTECA: " + nombre + " ***");

        System.out.println("Existen " + posicionProxLibro + " libros");
        if (catalogo == null || posicionProxLibro == 0){
            System.out.println("Actualmente, no hay libros en esta biblioteca");
        }
        if (catalogo != null) {
            for (int cont = 0; cont < posicionProxLibro; cont++) {
                Libro libros = catalogo[cont];

                if (libros != null){
                    System.out.println("----------------");
                    System.out.println((cont + 1) + "." + libros);
                }else{
                    System.out.println((cont +1) + "." + " ");
                }
            }
        }


    }

    public void mostrarLibroPorMaxPaginas(int maximo){
        System.out.println("***** LIBROS CON EL NÚMERO MAYOR DE PÁGINAS ****");
        if (catalogo != null && posicionProxLibro != 0){
            for (int cont = 0; cont < posicionProxLibro; cont++) {
                Libro unLibro = catalogo[cont];
                if (unLibro != null && unLibro.getNumPaginas() <= maximo){
                    System.out.println("-------------------------");
                    System.out.println(unLibro);
                }
            }

        }
    }

    public void mostrarNacionalidadDeAutores(){
        System.out.println("MOSTRANDO NACIONALIDADES DE AUTORES");
        if (catalogo != null && posicionProxLibro != 0){
            for (int cont = 0; cont < posicionProxLibro; cont++) {
                Libro unLibro = catalogo[cont];
                Autor escritorDelLibro = unLibro.getEscritor();
                System.out.println("Escritor: " + escritorDelLibro);
            }
        }

    }
    public void mostrarAutoresPorNacionalidad(String nacionalidad){
        System.out.println("BUSCANDO AUTORES POR NACIONALIDAD: " + nacionalidad);
        if (catalogo != null && posicionProxLibro != 0){
            for (int cont = 0; cont < posicionProxLibro; cont++) {
                Libro uno = catalogo[cont];
                Autor escritorDelLibro = uno.getEscritor();
                String nacionalidadEscritor = escritorDelLibro.getNacionalidad();
                if (nacionalidadEscritor.equalsIgnoreCase(nacionalidad)) {
                    System.out.println("Coincidencia: " + escritorDelLibro);
                }
            }
        }
    }

    public Libro[] getCatalogo() {
        return catalogo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
}

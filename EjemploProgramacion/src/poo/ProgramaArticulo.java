package poo;

public class ProgramaArticulo {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Pijama",10,5);
        articulo1.setPrecio(20);
        mostrarArticuloCompleto(articulo1);

        Articulo articulo2 = new Articulo("Zapatos", 40,6);
        articulo2.setNombre("Pantalones");
        mostrarArticuloCompleto(articulo2);
    }

    public static void mostrarArticuloCompleto(Articulo otro){
        otro.mostrarNombreArticuloSinIva();
    }
}

package poo;

public class Articulo {
    String nombre;
    double precio;
    double iva = 21;
    int cuantosQuedan;


    public Articulo(String nombre, double precio, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    public Articulo(String nombre, double precio, double iva , int cuantosQuedan){
        if (nombre == null){
            System.err.println("ERROR");
        } else if (precio <= 0) {
            System.err.println("ERROR");
        } else if (iva < 0 || iva > 100) {
            System.err.println("ERROR");
        }else if (cuantosQuedan < 0){
            System.err.println("ERROR");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }

    public void mostrarNombreArticuloSinIva(){
        System.out.println(this.nombre + " - " + "Precio:" + precio + " - " + "IVA:" + iva + "%" + " - " + "PVP:" + mostrarPrecioConIva() );
    }

    public double mostrarPrecioConIva(){
        return (precio * 0.21) + precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

package accesobd;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private boolean activo;

    public Producto(int id, String nombre, double precio, int stock, boolean activo, Categoria catProducto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }

    public void mostrarProducto() {
        String lineaProducto = "\t - ID: %d | Nombre: %s | Precio: %f | Stock: %d | Activo: %s";

        System.out.println(String.format(lineaProducto, getId(), getNombre(),getPrecio(),
                getStock(), isActivo() ? "SI" : "NO"));

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", activo=" + activo +
                '}';
    }
}
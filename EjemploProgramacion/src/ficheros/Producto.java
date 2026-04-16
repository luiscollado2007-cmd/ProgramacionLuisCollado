package ficheros;

public class Producto {
    private String id;
    private String producto;
    private double precio;
    private double stock;

    public Producto(String id, String producto, double precio, double stock) {
        this.id = id;
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}

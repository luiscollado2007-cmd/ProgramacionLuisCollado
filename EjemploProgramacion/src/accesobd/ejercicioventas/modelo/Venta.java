package accesobd.ejercicioventas.modelo;

import java.time.LocalDate;

public class Venta {

    private int id;
    private String nombreCliente;
    private String nombreProducto;
    private int cantidad;
    private LocalDate fechaVenta;

    public Venta(int id, String nombreCliente, String nombreProducto, int cantidad, LocalDate fechaVenta) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", cantidad=" + cantidad +
                ", fechaVenta=" + fechaVenta +
                '}';
    }
}
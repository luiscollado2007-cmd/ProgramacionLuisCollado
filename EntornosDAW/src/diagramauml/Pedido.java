package diagramauml;

import diagramauml.tiposusuario.Cliente;
import diagramauml.tiposusuario.Repartidor;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Repartidor repartidor;
    private List<Producto> productos = new ArrayList<>();
    private EstadoPedido estado;
    private String fecha;
    private double precioTotal;

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.estado = estado.PENDIENTE;
        this.precioTotal = 0;

        if (cliente != null){
            cliente.agregarPedido(this);
        }
    }

    public void agregarProducto(Producto p){
        productos.add(p);
        recalcularPrecioTotal();
    }
    private void recalcularPrecioTotal() {
        precioTotal = productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public void confirmar() {
        if (estado == EstadoPedido.PENDIENTE) {
            estado = EstadoPedido.PENDIENTE;
        }
    }

    public void cancelar() {
        if (estado == EstadoPedido.PENDIENTE || estado == EstadoPedido.EN_CAMINO) {
            estado = EstadoPedido.CANCELADO;
        }
    }

    public void actualizarEstado(EstadoPedido nuevoEstado) {
        estado = nuevoEstado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}

package diagramauml.tiposusuario;

import diagramauml.EstadoPedido;
import diagramauml.Pedido;
import diagramauml.Usuario;

public class Repartidor extends Usuario {
    private String vehiculo;
    private double valoracionMedia;
    public Repartidor(int id, String nombre, String direccion, String email, String telefono,String vehiculo,double valoracionMedia) {
        super(id, nombre, direccion, email, telefono);
        this.vehiculo = vehiculo;
        this.valoracionMedia = valoracionMedia;
    }

    public void aceptarPedido(Pedido pedido) {
        pedido.setRepartidor(this);
        pedido.actualizarEstado(EstadoPedido.EN_CAMINO);
    }

    public void rechazarPedido(Pedido pedido) {
        pedido.setRepartidor(null);
        pedido.actualizarEstado(EstadoPedido.PENDIENTE);
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(double valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }
}

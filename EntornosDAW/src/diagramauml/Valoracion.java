package diagramauml;

import diagramauml.tiposusuario.Cliente;

public class Valoracion {
    private int id;
    private Cliente cliente;
    private Pedido pedido;
    private double puntuacion;
    private String comentario;

    public Valoracion(int id, Cliente cliente, Pedido pedido, double puntuacion, String comentario) {
        this.id = id;
        this.cliente = cliente;
        this.pedido = pedido;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
    }

    public boolean esValida(){
        return puntuacion >= 1 && puntuacion <= 5;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

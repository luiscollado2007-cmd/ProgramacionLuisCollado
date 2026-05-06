package diagramauml.tiposusuario;

import diagramauml.Usuario;

public class Cliente extends Usuario {
    private String metodoPago;
     public Cliente(int id, String nombre, String direccion, String email, String telefono, String metodoPago) {
        super(id, nombre, direccion, email, telefono);
        this.metodoPago = metodoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}

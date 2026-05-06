package diagramauml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String direccion;
    private String email;
    private String telefono;
    private List<Pedido> historialPedidos = new ArrayList<>();

    public Usuario(int id, String nombre, String direccion, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    public List<Pedido> consultarHistorialPedidos() {
        return Collections.unmodifiableList(historialPedidos);
    }

    protected void agregarPedidoAlHistorial(Pedido pedido) {
        historialPedidos.add(pedido);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

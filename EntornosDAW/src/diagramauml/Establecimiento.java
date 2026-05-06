package diagramauml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Establecimiento {
    private int id;
    private String nombre;
    private String direccion;
    private String tipoCocina;
    private String horarioApertura;
    private List<Producto> carta = new ArrayList<>();

    public Establecimiento(int id, String nombre, String direccion, String tipoCocina, String horarioApertura) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCocina = tipoCocina;
        this.horarioApertura = horarioApertura;
    }

    public List<Producto> mostrarCarta(){
        return Collections.unmodifiableList(carta);
    }

    public void agregarProducto(Producto p){
        carta.add(p);
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

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public String getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(String horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public List<Producto> getCarta() {
        return carta;
    }

    public void setCarta(List<Producto> carta) {
        this.carta = carta;
    }
}

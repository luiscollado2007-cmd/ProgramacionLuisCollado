package colecciones.juegocartas;

import java.util.Objects;

public class Carta {

    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(palo, carta.palo) && Objects.equals(valor, carta.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palo, valor);
    }
}

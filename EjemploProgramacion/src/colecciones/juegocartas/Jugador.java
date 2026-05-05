package colecciones.juegocartas;

import java.util.HashSet;
import java.util.Set;

public class Jugador {

    private Set<Carta> almacenarCartas;

    public Jugador(){
        almacenarCartas = new HashSet<>();
    }

    public boolean agregarCarta(Carta c){
        return almacenarCartas.add(c);
    }

    public void mostrarMano(){
        if (almacenarCartas.isEmpty()){
            System.out.println("La mano está vacía");
        }else{
            almacenarCartas.forEach(System.out::println);
        }



    }

    public Set<Carta> getAlmacenarCartas() {
        return almacenarCartas;
    }

    public boolean descartarCarta(Carta c){
        return almacenarCartas.remove(c);
    }
}

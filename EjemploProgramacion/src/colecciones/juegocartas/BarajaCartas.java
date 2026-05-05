package colecciones.juegocartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaCartas {
    List<Carta> cartas;

    public BarajaCartas(){
        cartas = new ArrayList<>();
        rellenarCartas();
        Collections.shuffle(cartas);
    }

    private void rellenarCartas(){
        String palos[] = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String valor[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos){
            for (String valo : valor){
                cartas.add(new Carta(palo,valo));
            }
        }
    }

    public Carta robarCartas(){
        if (cartas.isEmpty()){
            return null;
        }

        return cartas.remove(0);
    }

    public void devolverCarta(Carta c){
        cartas.add(c);
        Collections.shuffle(cartas);
    }

    public int cartasRestantes(){
        return cartas.size();
    }
}

package colecciones.juegocartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElJuegoDeCartas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        BarajaCartas baraja = new BarajaCartas();
        Jugador jugador = new Jugador();

        int opcion;
        do{
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Robar carta");
            System.out.println("2. Ver mano");
            System.out.println("3. Ver cartas restantes en la baraja");
            System.out.println("4. Descartar carta");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    Carta cartaRobada = baraja.robarCartas();
                    if (cartaRobada == null){
                        System.out.println("No hay cartas en la baraja");
                    } else if (jugador.agregarCarta(cartaRobada)) {
                        System.out.println("Has robado : " + cartaRobada);
                    }else{
                        System.out.println("Carta repetida. Te devuelvo la carta");
                        baraja.devolverCarta(cartaRobada);
                    }
                    break;
                case 2:
                    System.out.println("Tu mano");
                    jugador.mostrarMano();
                    break;
                case 3:
                    System.out.println("Las cartas restantes que te quedan son: " + baraja.cartasRestantes());
                    break;
                case 4:
                    System.out.println("Elige una carta a descartar: ");
                    List<Carta> lista = new ArrayList<>(jugador.getAlmacenarCartas());

                    for (int cont = 0; cont < lista.size(); cont++) {
                        System.out.println( (cont + 1) + ". " + lista.get(cont));
                    }

                    if (lista.isEmpty()){
                        System.out.println("No tienes cartas para descartar.");
                        break;
                    }
                    int cartaDescartada = teclado.nextInt();
                    teclado.nextLine();

                    if (cartaDescartada < 1 || cartaDescartada > lista.size()){
                        System.out.println("Opción no válida");
                    }else {
                        Carta carta = lista.get(cartaDescartada - 1);
                        jugador.descartarCarta(carta);
                        baraja.devolverCarta(carta);
                        System.out.println("Has descartado: " + carta);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }

}

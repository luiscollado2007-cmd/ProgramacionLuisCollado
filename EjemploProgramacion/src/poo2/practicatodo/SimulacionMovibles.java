package poo2.practicatodo;

public class SimulacionMovibles {
    public static void main(String[] args) {
        Movible[] cosas = {
                new Jugador("Ibra", 5, 3, 50),
                new Enemigo("Orco", 4, 2, 3),
                new Robot("123445656", 5, 9, 79)
        };


        for (int cont = 0; cont < cosas.length; cont++) {
            Movible movible = cosas[cont];
            System.out.println(cosas[cont]);
            movible.mover(1, 1);
            movible.mover(2, 0);
            movible.mover(-1, 3);
            System.out.println();
        }
    }
}

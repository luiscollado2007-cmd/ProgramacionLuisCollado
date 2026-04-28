package accesobd;

public class PruebaTiempos {

    public static void main(String[] args) {


        long tiempoInicial = System.currentTimeMillis();

        long cuenta = 0;
        for (int i = 0; i < 1_000_000; i++) {
            System.out.println("_");
        }
        long tiempoFinal = System.currentTimeMillis();

        System.out.println("Ha tardado " + (tiempoFinal-tiempoInicial) + " milisegs");

    }
}
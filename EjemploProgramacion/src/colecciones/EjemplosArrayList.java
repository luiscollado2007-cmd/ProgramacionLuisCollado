package colecciones;

import java.util.ArrayList;

public class EjemplosArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Sheila");
        nombres.add("Noelia");
        nombres.add("Otman");
        nombres.add("Bea");
        nombres.add("Diego");

        System.out.println("¿Cuántos nombres hay?: " + nombres.size());

        System.out.println("Nombre en la posición 4: " + nombres.get(4));

        nombres.remove(4);

        System.out.println("¿Cuántos nombres hay?: " + nombres.size());
    }
}

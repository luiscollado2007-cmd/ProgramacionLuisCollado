package repasora2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Dime un precio");
        int precio1 = t.nextInt();
        t.nextLine();
        System.out.println("Dime otro precio");
        int precio2 = t.nextInt();
        t.nextLine();
        System.out.println("Dime otro");
        int precio3 = t.nextInt();
        t.nextLine();
        System.out.println("Dime otro precio");
        int precio4 = t.nextInt();
        t.nextLine();

        System.out.println("Dime el último precio");
        int precio5 = t.nextInt();
        t.nextLine();

        System.out.println("El precio con IVA del primero es: " + precioConIVA(precio1));
        System.out.println("El precio con IVA del segundo es: " + precioConIVA(precio2));
        System.out.println("El precio con IVA del tercero es: " + precioConIVA(precio3));
        System.out.println("El precio con IVA del cuarto es: " + precioConIVA(precio4));
        System.out.println("El precio con IVA del quinto es: " + precioConIVA(precio5));
    }

    public static double precioConIVA(double precio){
        return precio * 1.21;
    }
}

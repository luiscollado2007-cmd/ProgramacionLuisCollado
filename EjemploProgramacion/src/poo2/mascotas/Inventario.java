package poo2.mascotas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {

        Mascotas[] mascotasTienda = generarMascotas(4);

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {

            generarMenu();
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    mostrarListaAnimales(mascotasTienda);
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Por favor diga el tipo de animal");
                    String tipoAnimal = sc.nextLine();

            }
        }while (opcion != 0);


    }

    private static void mostrarListaAnimales(Mascotas[] mascotasTienda){
        for (int cont = 0; cont < mascotasTienda.length; cont++) {
            if (mascotasTienda[cont] != null){
                mascotasTienda[cont].muestra();
            }
        }
    }

    private static void generarMenu() {
        System.out.println("*** MENÚ DE LA TIENDA ***");
        System.out.println("1.Mostrar la lista de los animales");
        System.out.println("2.Mostrar todos los datos de un animal concreto (por nombre)");
        System.out.println("3.Mostrar todos los datos de un animal concreto (por tipo de animal)");
        System.out.println("4.Mostrar todos los datos de todos los animales");
        System.out.println("5.Insertar animales en el inventario");
        System.out.println("6.Eliminar animales del inventario");
        System.out.println("7.Vaciar el inventario.");
        System.out.println("0.Salir");
    }

    public static Mascotas[] generarMascotas(int numMascotas){
        Mascotas[] listaMascotas = new Mascotas[4];

        LocalDate fechaNacMilu = LocalDate.of(2020, Month.AUGUST, 15);
        LocalDate fechaNacToby = LocalDate.of(2016, Month.FEBRUARY, 28);

        LocalDate fechaNacManuela = LocalDate.of(2019, Month.APRIL, 10);
        listaMascotas[0] = new Perro("Milú",7, EstadoMascota.VIVO, fechaNacMilu, "Chucho",false);
        listaMascotas[1] = new Perro("Toby",10, EstadoMascota.VIVO, fechaNacToby, "Chucho",false);
        listaMascotas[2] = new Loro("Manuela",7, EstadoMascota.VIVO, fechaNacManuela, "Afilado",false,
        "Canarias", true);


        return listaMascotas;
    }
}

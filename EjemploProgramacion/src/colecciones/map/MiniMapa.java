package colecciones.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniMapa {
    public static void main(String[] args) {
        Map<String,Double> temperaturas = new HashMap<>();
        temperaturas.put("Madrid",18.5);
        temperaturas.put("Barcelona", 21.0);
        temperaturas.put("Valencia",19.3);
        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- MENÚ DE TEMPERATURAS ---");
            System.out.println("1. Listar todas las ciudades y sus temperaturas");
            System.out.println("2. Insertar nueva temperatura");
            System.out.println("3. Consultar temperatura por ciudad");
            System.out.println("4. Media de temperaturas");
            System.out.println("5. Temperatura máxima");
            System.out.println("6. Eliminar ciudad");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay ciudades registradas.");
                    } else {
                        System.out.println("Ciudades y temperaturas:");
                        for (String ciudad : temperaturas.keySet()) {
                            System.out.println(ciudad + " → " + temperaturas.get(ciudad) + "ºC");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Introduce el nombre de la ciudad: ");
                    String ciudadNueva = teclado.nextLine();
                    System.out.print("Introduce la temperatura: ");
                    double tempNueva = teclado.nextDouble();
                    temperaturas.put(ciudadNueva, tempNueva);
                    System.out.println("Temperatura añadida.");
                    break;

                case 3:
                    System.out.print("Introduce la ciudad a consultar: ");
                    String ciudadConsulta = teclado.nextLine();
                    if (temperaturas.containsKey(ciudadConsulta)) {
                        System.out.println("Temperatura de " + ciudadConsulta + ": " + temperaturas.get(ciudadConsulta) + "ºC");
                    } else {
                        System.out.println("La ciudad no está registrada.");
                    }
                    break;

                case 4:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay datos para calcular la media.");
                    } else {
                        double suma = 0;
                        for (double t : temperaturas.values()) {
                            suma += t;
                        }
                        System.out.println("Temperatura media: " + (suma / temperaturas.size()) + "ºC");
                    }
                    break;

                case 5:
                    if (temperaturas.isEmpty()) {
                        System.out.println("No hay datos para calcular la temperatura máxima.");
                    } else {
                        double max = Double.MIN_VALUE;
                        String ciudadMax = "";
                        for (Map.Entry<String, Double> entry : temperaturas.entrySet()) {
                            if (entry.getValue() > max) {
                                max = entry.getValue();
                                ciudadMax = entry.getKey();
                            }
                        }
                        System.out.println("Temperatura máxima: " + max + "ºC en " + ciudadMax);
                    }
                    break;

                case 6:
                    System.out.print("Introduce la ciudad a eliminar: ");
                    String ciudadEliminar = teclado.nextLine();
                    if (temperaturas.remove(ciudadEliminar) != null) {
                        System.out.println("Ciudad eliminada.");
                    } else {
                        System.out.println("La ciudad no existe.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        }while (opcion != 0);
    }
}

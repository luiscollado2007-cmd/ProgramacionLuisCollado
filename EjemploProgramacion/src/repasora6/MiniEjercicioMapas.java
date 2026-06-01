package repasora6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniEjercicioMapas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String,Double> temperaturas = new HashMap<>();
        temperaturas.put("Madrid",32.5);
        temperaturas.put("Sevilla",36.7);
        int opcion = 0;
        while (opcion != 7){
            System.out.println("**** MENÚ PARA INTERACTUAR TEMPERATURAS ***");
            System.out.println("1.Listar todas las ciudades y temperaturas");
            System.out.println("2.Insertar nueva temperatura.");
            System.out.println("3.Consultar temperatura por ciudad.");
            System.out.println("4.Media de temperaturas.");
            System.out.println("5.Temperatura máxima.");
            System.out.println("6.Eliminar ciudad.");
            System.out.println("7.Salir.");

            System.out.println("ELIJA SU OPCIÓN:");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    if (temperaturas.isEmpty()){
                        System.out.println("No hay registros de ciudades y temperaturas.");
                    }else{
                        System.out.println("Ciudades con sus temperaturas");
                        for (String ciudad : temperaturas.keySet()){
                            System.out.println(ciudad + " -> " + temperaturas.get(ciudad));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digame la ciudad que desea introducir: ");
                    String ciudadUsuario = teclado.nextLine();
                    System.out.print("Ahora digame su temperatura: ");
                    double temperatura = teclado.nextDouble();
                    temperaturas.put(ciudadUsuario,temperatura);
                    break;
                case 3:
                    System.out.println("Dime la ciudad y te digo la temperatura");
                    String ciudad = teclado.nextLine();

                    if (temperaturas.containsKey(ciudad)){
                        System.out.println("La temperatura de la ciudad " + ciudad + " es: " + temperaturas.get(ciudad));
                    }

                    break;
                case 4:
                    if (temperaturas.isEmpty()){
                        System.out.println("No hay temperaturas para hacer la media");
                    }
                    double mediaTemperaturas = 0;
                    for (String ciudades : temperaturas.keySet()){
                        mediaTemperaturas += temperaturas.get(ciudades);
                    }
                    mediaTemperaturas = mediaTemperaturas / temperaturas.size();
                    System.out.println("La media de las temperaturas es: " + mediaTemperaturas + "ºC");
                    break;
                case 5:
                    if (temperaturas.isEmpty()){
                        System.out.println("No hay temperaturas para sacar la máxima temperatura");
                    }else{
                        double tempMax = Double.MIN_VALUE;
                        String ciudadMax = "";
                        for (Map.Entry<String,Double> v : temperaturas.entrySet()){
                            if (v.getValue() > tempMax){
                                tempMax = v.getValue();
                                ciudadMax = v.getKey();
                            }
                        }
                        System.out.println("Temperatura máxima: " + tempMax + "ºC en " + ciudadMax);
                    }
                    break;
                case 6:
                    System.out.println("Dime el nombre de la ciudad que quieras eliminar:");
                    String ciudadEliminar = teclado.nextLine();
                    temperaturas.remove(ciudadEliminar);
                    break;
                case 7:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}

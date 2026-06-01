package repasora6;

import java.util.*;

public class MiniEjercicioVotaciones {
    public static void main(String[] args) {
        List<String> votos = generarVotosAleatorios(10);
        System.out.println("Lista de votos");
        System.out.println(votos);

        Map<String,Integer> contador = new HashMap<>();
        for (String nombre : votos){
            if (contador.containsKey(nombre)){
                contador.put(nombre, contador.get(nombre) + 1);
            }else{
                contador.put(nombre,1);
            }
        }

        System.out.println("Resultadoss");
        for (String alumno : contador.keySet()){
            System.out.println(alumno + " con " + contador.get(alumno) + " votos.");
        }

        String ganador = null;
        int maxVotos = -1;

        for (String alumno: contador.keySet()){
            int votosPorAlumno = contador.get(alumno);
            if (votosPorAlumno > maxVotos){
                maxVotos = votosPorAlumno;
                ganador = alumno;
            }
        }

        System.out.println("El ganador es: " + ganador + " con " + maxVotos + " votos.");
    }

    private static List<String> generarVotosAleatorios(int cantidad) {
        List<String> alumnos = Arrays.asList("Luis","Izan","Radu","Victoria","Jeremy");
        List<String> votos = new ArrayList<>();
        Random random = new Random();
        for (int cont = 0; cont < cantidad; cont++) {
            int posicionAlumno = random.nextInt(alumnos.size());
            votos.add(alumnos.get(posicionAlumno));
        }
        return votos;
    }
}

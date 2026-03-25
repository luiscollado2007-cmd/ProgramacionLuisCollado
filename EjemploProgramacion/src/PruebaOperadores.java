public class PruebaOperadores {

    public static void main(String[] args) {
        System.out.println("Iniciando....");

        int numero = 0;
        numero = 6 * 3;
        int restoDivision = 7 % 2;
        System.out.println(numero);
        System.out.println(restoDivision);
        int contador = 5;
        contador++;
        contador = contador + 1;
        contador += 2;
        contador *= 8;

        System.out.println("Contador (primer mensaje): " + contador);
        contador++;
        System.out.println("Contador (segundo mensaje): " + contador);
        System.out.println("Contador (tercer mensaje): " + (++contador));

        int edad1 = 18;
        int edad2 = 40;
        boolean esMenor1Que2 = edad1 < edad2;
        System.out.println("¿Es mayor 1 que 2? " + esMenor1Que2);

        int notaAlumno1 = 5;
        int notaAlumno2 = 5;
        boolean sonIguales = notaAlumno1 >= notaAlumno2;
        System.out.println("¿Alumno 1 tiene más nota que Alumno 2? " + sonIguales);


        int numeroLargo = 2147483647;
        numeroLargo-=2;
        System.out.println("Numero largo: " + numeroLargo);

        System.out.println("Contador: " + contador);
        System.out.println("Finalizando...");

        /*
        Declara una constante float para PI
        Calcula el área de un circulo de radio 5.
        Muestra el valor resultante
         */

        /*
        Crea una variable con tu edad
        Dividela entre 7
        Crea una variable booleana esViejo que tenga TRUE si el valor es mayor a 10
         */
    }


}

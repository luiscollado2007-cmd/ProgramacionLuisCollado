import com.sun.jdi.BooleanValue;

public class HolaMundo {

    public static void main(String[] args) {
        int numero = 6;
        final double PI = 3.1416;
        final double valorGravedad = 9.8;
        while(numero <= 100){
            int miVariable = 10;
            miVariable = miVariable + 1;
            numero = numero + 1;
        }
         byte variableByte = 18;
         short  variableShort = -15000;
         int contador = 1_000_000;
         long contadorGrandre = 20000;

         float notaAlumno = 5 / 2f;
         System.out.println("La nota es: " + notaAlumno);

         double notaMaxima = 10.0;

         char respuestaSI ='S';
        char respuestaNo ='N' ;

        Boolean haAcertado = false;
        Boolean esfestivo = true;
        Boolean aprobado = false;
        Boolean esPositivo = (numero >= 0);
        String nombre = "Luis";

        System.out.println("Me llamo Luis.Contador:" + contador);
        System.out.println("Tengo 18 años");
        System.out.println("Mi nombre es " + nombre + " y tengo " + variableByte);

    }

}

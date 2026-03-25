package poo;

import java.util.Scanner;

public class ProgramaPersonaNueva {
    public static void main(String[] args) {

        System.out.println("El dni 1234A es válido? " + PersonaNueva.validarDNI("1234A"));
        System.out.println("El dni 12345678A es válido? " + PersonaNueva.validarDNI("12345678A"));
        System.out.println("El dni 123456789 es válido? " + PersonaNueva.validarDNI("123456789"));
        PersonaNueva wow = new PersonaNueva("Luis","23456789S","Collado",30);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola, introduzca su nombre, por favor");
        String nombreUsuario = teclado.nextLine();
        System.out.println("Siguiendo, introduzca su dni");
        String dniUsuario = teclado.nextLine();
        System.out.println("Ahora su apellido");
        String apellidoUsuario = teclado.nextLine();
        System.out.println("Y por último su edad.");
        int edadUsuario = teclado.nextInt();
        PersonaNueva informacionUsuario = new PersonaNueva(nombreUsuario,dniUsuario,apellidoUsuario,edadUsuario);

        informacionUsuario.mostrarInformacion();


        imprimirPersona(informacionUsuario);

        int diferenciaEntreUnaPersonaYOtra = wow.diferenciaEdad(informacionUsuario);
        System.out.println("La diferencia de edad es: " + diferenciaEntreUnaPersonaYOtra);

        System.out.println("¿Luis es jubilado? " + wow.esJubilado());
        System.out.println("¿Luis es mayor de edad? " + wow.esMayorEdad());


    }

    public static void imprimirPersona(PersonaNueva informacionUsuario){
        System.out.println("Nombre: " + informacionUsuario.getNombre());
        System.out.println("dni: " + informacionUsuario.getDni());
        System.out.println("Apellido: " + informacionUsuario.getApellidos());
        System.out.println("edad: " + informacionUsuario.getEdad());
    }
}

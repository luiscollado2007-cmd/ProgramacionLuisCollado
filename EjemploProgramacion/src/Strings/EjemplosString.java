package Strings;

public class EjemplosString {

    public static void main(String[] args) {

        String nombre = "DIEGO";
        String nombre2 = new String("Diego");
        if (nombre.equalsIgnoreCase(nombre2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        //IgnoreCase se refiere a que ignore si lleva mayúsculas o minúsculas.

        System.out.println("Longitud del nombre: " + nombre.length());

        System.out.println("-----EJEMPLOVALUEOF------");
        String dni = String.valueOf(45874524);
        System.out.println("dni = " + dni);
        System.out.println("Longitud del dni: " + dni.length());

        System.out.println("-----EJEMPLO CONCATENACIÓN-------");
        String apellidos = "Manuélez";
        String nombreCompleto = nombre.concat(apellidos);
        System.out.println("nombreCompleto = " + nombreCompleto);

        System.out.println("--- EJEMPLO CHARAT---");
        String dniPaco = "2A";
        System.out.println("dniPaco.length() = " + dniPaco.length());
        char letraDni = dniPaco.charAt(dniPaco.length() - 1);
        System.out.println(letraDni);

        System.out.println("--- EJEMPLO SUBSTRING ---");
        String email = "luis.collado@educa.madrid.org";
        String nombreUsuario = email.substring(0,12);
        System.out.println("nombreUsuario = " + nombreUsuario);

        String dominio = email.substring(13);
        System.out.println("dominio = " + dominio);

        System.out.println("--- EJEMPLO INDEXOF---");
        int posicionArroba = email.indexOf("@");
        System.out.println("posicionArroba = " + posicionArroba);

        System.out.println("--- EJEMPLO LASTINDEXOF---");
        int posicionUltimo = email.lastIndexOf(".");
        System.out.println("posicionUltimo = " + posicionUltimo);

        System.out.println("--- EJEMPLO INDEXOF A PARTIR DE---");
        int posicionPrimerPunto = email.indexOf(".");
        System.out.println("posicionPrimerPunto = " + posicionPrimerPunto);

        int posicionPuntoMedio = email.indexOf(".",posicionPrimerPunto + 1);
        System.out.println("posicionPuntoMedio = " + posicionPuntoMedio);

        int posicionInexistente = email.indexOf("*");
        System.out.println("posicionInexistente = " + posicionInexistente);

        System.out.println("--- EJEMPLO ENDSWITH---");
        boolean esDominioOrg = email.endsWith("org");
        if (esDominioOrg){
            System.out.println("Es un dominio de Organización");
        }else{
            System.out.println("NO es un dominio de Organización");
        }

        System.out.println("--- EJEMPLO REPLACE--- ");
        String frase = "Estoy estudiando Programación";

        String fraseCambiada = frase.replace('e','a');
        System.out.println("frase = " + fraseCambiada);

        System.out.println("--- EJEMPLO UPPERCASE / LOWERCASE---");
        String fraseMayus = frase.toUpperCase();
        System.out.println("fraseMayus = " + fraseMayus);

        String fraseMinus = frase.toLowerCase();
        System.out.println("fraseMinus = " + fraseMinus);

        System.out.println("--- EJEMPLO TOCHARARRAY---");
        String texto = "texto de prueba";
        char [] arrayCaracteres = texto.toCharArray();
        for (int numLetra = 0; numLetra < arrayCaracteres.length ; numLetra++) {
            System.out.println(arrayCaracteres[numLetra]);
        }

        System.out.println("--- EJEMPLO FORMAT---");
        int edadAlumno = 18;
        float notaAlumno = 6.0f;
        String nombreAlumno = "Paco";
        String apellidosAlumno = "Sánchez";
        String ciudadAlumno = "Lugo";


        System.out.println("El alumno " + nombreAlumno + " que tiene " + edadAlumno + " ha sacado " + notaAlumno);
        //%s --> cadena de texto
        //%d --> un entero
        //%f --> valor flotante(float o double)
        String mensaje = "Tiene %d años, se llama %s y ha obtenido un %f ";
        String mensajeFormateado = String.format(mensaje,edadAlumno,nombreAlumno,notaAlumno);
        String mensaje2 = "El alumno %s %s vive en la ciudad %s";
        String mensajeFormateado2 = String.format(mensaje2,nombreAlumno,apellidosAlumno,ciudadAlumno);
        System.out.println("mensajeFormateado = " + mensajeFormateado);
        System.out.println("mensajeFormateado2 = " + mensajeFormateado2);
    }


}

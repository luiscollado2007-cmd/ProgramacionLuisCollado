package poo2.ejercicioProfe.ejercicio1;

public class MainFigura {
    public static void main(String[] args) {
        Circulo uno = new Circulo("Rojo","Vacío",true,"15-1-2023",10);
        System.out.println("El perímetro del círculo es: " + uno. perimetro());
        System.out.println("El diámetro del círculo es: " + uno.diametro());

        Rectangulo dos = new Rectangulo("Verde","Loco",false,"12-12-2024",4,7);
        System.out.println("El perímetro del rectángulo es: " + dos.perimetroRectangulo());
    }




}

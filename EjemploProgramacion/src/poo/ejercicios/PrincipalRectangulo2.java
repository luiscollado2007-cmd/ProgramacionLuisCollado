package poo.ejercicios;

public class PrincipalRectangulo2 {
    public static void main(String[] args) {
        Punto primerPuntoRect1 = new Punto(1,1);
        Punto punto2Rect1 = new Punto(5,4);
        Rectangulo rect1 = new Rectangulo(primerPuntoRect1,punto2Rect1);
        Punto punto2Rect1Modificado = new Punto(12,10);
        rect1.setPunto2(punto2Rect1Modificado);
        rect1.imprimir();
        System.out.println("El área de este rectángulo es: " + rect1.getArea());
        rect1.dibujeRectangulo();


        Punto punto1Rect2 = new Punto(2,1);
        Punto punto2Rect2 = new Punto(6,3);
        Rectangulo rect2 = new Rectangulo(punto1Rect2,punto2Rect2);
        rect2.imprimir();
        System.out.println("El perímetro de este triángulo es: " + rect2.getPerimetro());

        Punto punto1Rect3 = new Punto(5,5);
        Punto punto2Rect3 = new Punto(2,2);
        Rectangulo rect3 = new Rectangulo(punto1Rect3,punto2Rect3);


    }
}

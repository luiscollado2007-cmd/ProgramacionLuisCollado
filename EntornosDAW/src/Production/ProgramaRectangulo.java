package Production;

public class ProgramaRectangulo {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(6,0,5,5);
        rectangulo1.setX1(9);
        rectangulo1.setY2(8);
        rectangulo1.mostrarCoordenadas();

        mostrarResultados(rectangulo1);

        Rectangulo rectangulo2 = new Rectangulo(7,9,2,3);
        rectangulo2.setY1(7);
        rectangulo2.setY2(2);
        rectangulo2.mostrarCoordenadas();

        mostrarResultados(rectangulo2);
    }

    public static void mostrarResultados(Rectangulo otro){
        System.out.println("El perímetro del rectángulo son: " + otro.perimetro());
        System.out.println("El área de un rectángulo es: " + otro.area());
    }
}

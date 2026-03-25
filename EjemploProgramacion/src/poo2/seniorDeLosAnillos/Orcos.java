package poo2.seniorDeLosAnillos;

public class Orcos extends senio{
    public Orcos(String nombre, int cantidad, int coordX, int coordY) {
        super(nombre, cantidad, coordX, coordY);
    }

    public void setMovimientoOrco(int cantidad){
        setCoordX(getCoordX() + cantidad);
        setCoordY(getCoordY() + cantidad);
    }

    public void gritar(){
        System.out.println("chillidooo");
    }

    public void avisarSauron(){
        System.out.println("Klk sauron, dime a vel");
    }
}

package Production;

public class Rectangulo {
    int x1;
    int x2;
    int y1;
    int y2;


    public Rectangulo(int x1,int y1, int x2,int y2){
        if (x1 < x2 && y1 < y2){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
        }else{
            System.err.println("ERROR al instanciar Rectángulo");
        }

    }

    public void mostrarCoordenadas(){
        System.out.println("(" + this.x1 + "," + this.x2 + ")" + "(" + this.y1 + "," + this.y2 + ")");
    }

    public int base(){
        return Math.abs(x2 -x1);
    }

    public int altura(){
        return Math.abs(y2 - y1);
    }

    public int perimetro(){
        return 2 * (base() + altura());
    }

    public int area(){
        return base() * altura();
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
}

package arrays;

public class EjemploArrays3 {
    public static void main(String[] args) {

        int[] notas2 = new int[]{2,5,8,9,15,21};
        int longitudArray = notas2.length;
        System.out.println("longitudArray = " + longitudArray);
        for (int cont = 0; cont < longitudArray; cont++){
            System.out.println(cont + ": " + notas2[cont]);
        }



    }
}

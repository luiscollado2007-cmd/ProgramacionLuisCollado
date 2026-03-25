package PrácticaDebug;
import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();
        // Calculate the average of the three numbers
        // -------->add a breakpoint just in next line
        double average = calculateAverage(num1, num2, num3);
        //He quitado la variable anotherAverage y la siguiente línea ya que da igual los números que ponga el usuario,
        //siempre serán lsos valores que le han puesto a las variables.
        // Print the result
        System.out.println("The average is: " + average);
    }
    // Function to calculate the average
    public static double calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3;
        return average;
    }
}
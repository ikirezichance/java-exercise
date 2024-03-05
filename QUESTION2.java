
package question2;
import java.util.Scanner;

public class QUESTION2 {

   
    public static void main(String[] args) {
        
 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter  second number: ");
        int number2 = scanner.nextInt();

        int sum = calculateSum(number1, number2);
        System.out.println("Sum of numbers between " + number1 + " and " + number2 + " (inclusive) is: " + sum);
        
        scanner.close();
    }

    public static int calculateSum(int num1, int num2) {
        int sum = 0;
        for (int a = num1; a <= num2; a++) {
            sum += a;
        }
        return sum;
    }
}


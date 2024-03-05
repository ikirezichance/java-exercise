
package question11;
import java.util.Scanner;

public class QUESTION11 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int sum = calculateSumOfDigits(number);

        
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number%10 ;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}

  
   
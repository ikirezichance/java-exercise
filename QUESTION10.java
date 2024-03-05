
package question10;
import java.util.Scanner;

public class QUESTION10 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        Calculator calculator = new Calculator();
        
        System.out.println("Addition: " + calculator.addition(number1, number2));
        System.out.println("Subtraction: " + calculator.subtraction(number1, number2));
        System.out.println("Multiplication: " + calculator.multiplication(number1, number2));
        System.out.println("Division: " + calculator.division(number1, number2));
        
        scanner.close();
    }
}

class Calculator {
    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error:it Cannot divided by zero");
            return 0;
        }
        return num1 / num2;
    }
}

    
    


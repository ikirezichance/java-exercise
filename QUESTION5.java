
package question5;
import java.util.Scanner;

public class QUESTION5 {
int num;
    public static void factorialNumber(int number){
        number=number;
        int i=number-1;
        System.out.print(number);
        for( i=number-1;i>=1;i--){
        System.out.print("*"+i);
        } 
    }
    
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter Number You want to factorize");
        int get=in.nextInt();
       factorialNumber(get); 
        
    }
    
}

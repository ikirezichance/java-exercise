
package question16;
import java.util.Scanner;

public class QUESTION16 {
 int number1,number2,number3;
    void LargNumber(int number1,int number2,int number3){
    this.number1=number1;
     this.number2=number2;
      this.number3=number3;
    }
   
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int number1=scanner.nextInt();
        System.out.println("enter second number");
        int number2=scanner.nextInt();
        System.out.println("enter thrid number");
        int number3=scanner.nextInt();
        if((number1 >number2)&&(number1 >number3)){ System.out.println("large number is:"+number1);}
        else if((number2 >number1)&&(number2 >number3)){ System.out.println("large number is:"+number2);}
        else{System.out.println("large number is:"+number3);}
    
    }
    
}

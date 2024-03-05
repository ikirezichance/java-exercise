
package question20;
import java.util.Scanner;

public class QUESTION20 {

  
    public static void main(String[] args) {
       
       Scanner get=new Scanner(System.in);
        System.out.println("Enter year");
        int year=get.nextInt();
        if(year%200==0){
            System.out.println("this year is leap");
        }
        else{System.out.println("this year is not leap");}
    }
    
}
 

package question4;

import java.util.Scanner;


public class QUESTION4 {

   
    public static void main(String[] args) {
         Scanner getUserInput=new Scanner(System.in);
        System.out.println("Enter the Password Criteria");
        String get=getUserInput.next();
        if(get.contains("123")){
            System.out.println("get first one");
        }
        else if(get.contains("ABC@")){
            System.out.println("get second one");
        }
        else{
            System.out.println("get Thrid one");
        }
    }
    }
    


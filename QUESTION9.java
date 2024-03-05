
package question9;
import java.util.Scanner;
public class QUESTION9 {

   
    public static void main(String[] args) {
  
   
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        if (isPalindrome(input)) {
            System.out.println("This string is a palindrome.");
        } else {
            System.out.println("This string is not a palindrome.");
        }

        scanner.close();
    }

    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        
        while (left < right) {
            
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            
            left++;
            right--;
        }

        
        return true;
    }
}

    
    


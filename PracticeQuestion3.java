import java.util.*;

public class PracticeQuestion3 {
    public static boolean isPalindrom(int number){
        int n = number;
        int rev = 0;
        while(number!=0){
            int rem = number%10;
            rev = (rev*10) + rem;
            number = number/10;  
        }
        if(n == rev){
            return true;
        }
        return false; 
    }
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println( n + " is Palindrome: " + isPalindrom(n));
    }
}

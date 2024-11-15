import java.util.*;

public class PracticeQuestion5 {
    public static int SumOfDigitsInAInteger(int n){
        int sum = 0;
        while(n > 0){
            int ld = n%10; 
            sum = sum + ld;
            n = n/10;
        } 
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits of the number is " + SumOfDigitsInAInteger(n));
    }
}

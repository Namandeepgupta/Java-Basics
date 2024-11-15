import java.util.*;

public class NumberIsPrimeOrNot {
    public static boolean isPrime (int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        if(isPrime(n)==true){
            System.out.println("Given number " + n + " is prime.");
        }
        else{
            System.out.println("Given number " + n + " is not prime.");
        }
    }
}
import java.util.*;

public class PtimizePrimeCheck {
    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
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
        if(isPrime(n) == true){
            System.out.println("The Given number " + n +" is prime.");
        }
        else{
            System.out.println("Given number " + n + " is not prime.");
        }
    }
}

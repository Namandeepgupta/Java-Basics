import java.util.*;

public class PrintPrimeNumberInRange {
    public static boolean IsPrime(int m){
        if(m == 2){
            return true;
        }
        for(int i=2; i<=m-1; i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeRange(int m, int n){
        for(m=m; m<=n-1; m++){
            if(IsPrime(m) == true){
                System.out.println(m);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for prime numbers: ");
        System.out.print("Upper limit: ");
        int m = sc.nextInt();
        System.out.print("Lower limit: ");
        int n = sc.nextInt();
        System.out.println("The prime number between " + m + " to " + n + " are given below: ");
        PrimeRange(m,n);
    }
}

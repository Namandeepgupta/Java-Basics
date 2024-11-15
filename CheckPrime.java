import java.util.*;

public class CheckPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println(n + " is a Prime Number.");
        }
        else{
            boolean IsPrime = true;
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    IsPrime = false;
                }
            }
            if(IsPrime==true){
                System.out.println(n + " is a Prime Number.");
            }
            else{
                System.out.println(n + " is not a Prime Number.");
            }
        }
    }
}

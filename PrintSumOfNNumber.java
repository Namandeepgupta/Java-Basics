import java.util.*;

public class PrintSumOfNNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("N Natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of n numbers: " + sum);
    }   
}

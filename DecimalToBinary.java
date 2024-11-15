import java.util.*;

public class DecimalToBinary {
    public static int BinToDec(int n){
        int Pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10,Pow));
            Pow++;
            n=n/2;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Decimal number : ");
        int n = sc.nextInt();
        System.out.println("Binary number: " + BinToDec(n));
    }
}

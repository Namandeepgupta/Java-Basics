import java.util.*;

public class BinaryToDecimal {
    public static int BintoDec(int n){
        int dec = 0;
        int pow = 0;
        while(n>0){
            int ld = n%10; 
            dec = dec + (ld*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number whic you want to convert to decimal: ");
        int n = sc.nextInt();
        System.out.println(BintoDec(n));
    }
}

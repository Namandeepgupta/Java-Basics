import java.util.*;
public class ProductofTwoNumber{
    public static int multiply(int a, int b){
        int product = a * b ;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int pod = multiply(a,b);
        System.out.println("Product of two numbers: " + pod);
    }
}
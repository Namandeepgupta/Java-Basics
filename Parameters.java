import java.util.*;

public class Parameters {
    public static int Addition(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        int sum = Addition(a,b);
        System.out.println("Sum of two number : " + sum);
    }
}

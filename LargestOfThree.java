import java.util.*;

public class LargestOfThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("A= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        System.out.print("B= ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest number is A : " + a );
        }
        else if(b>c){
            System.out.println("Greatest number is B : " + b);
        }
        else{
            System.out.println("Greatest number is C : " + c);
        }
    }
}

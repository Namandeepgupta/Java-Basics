import java.util.*;

public class Question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        String number =  (num > 0 ) ? "Positive" : "Negative" ;
        System.out.println(number);
    }
}
import java.util.*;

public class Question1withIfElse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
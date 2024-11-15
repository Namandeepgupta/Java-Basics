import java.util.*;

public class Ifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are an Adult");
        }
        if(age>12 && age<18){
            System.out.println("You are a Teenager");
        }
        else{
            System.out.println("You are a Child");
        }
    }
}

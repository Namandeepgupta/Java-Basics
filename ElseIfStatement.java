import java.util.*;

public class ElseIfStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Age = ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult.");
        }
        else if(age<18 && age>12){
            System.out.println("Teenage.");
        }
        else{
            System.out.println("Child.");
        }
    }
}

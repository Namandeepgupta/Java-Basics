import java.util.*;

public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the opration: ");
        char opration = sc.next().charAt(0);
        switch(opration){
            case '+' : 
            int result1 = num1 + num2 ;
            System.out.println("Addition: " + result1 );
                break;
            case '-' :
            int result2 = num1 - num2 ;
            System.out.println("Substraction: " + result2 );
                break;
            case '*' :
            int result3 = num1 * num2 ;
            System.out.println("Multipication: " + result3 );
                break;
            case '/' :
            int result4 = num1 / num2 ;
            System.out.println("Division: " + result4 );
                break;
            case '%' :
            int result5 = num1 % num2 ;
            System.out.println("Reminder: " + result5 );
                break;
            default : 
            System.out.println("You choose wrong oprator.");
        }
    }
}

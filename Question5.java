import java.util.*;

public class Question5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if( (year%4) == 0 ){
            if( (year%100) == 0 ){
                if ( (year%400) == 0 ){
                    System.out.println("Leap year");
                }
                else{
                    System.out.println("Not a Leap year");
                }
            }
            else{
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}

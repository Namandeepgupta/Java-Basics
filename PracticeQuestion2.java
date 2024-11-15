import java.util.*;

public class PracticeQuestion2 {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.println(a + " is even : " + isEven(a));
    }
}

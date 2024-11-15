import java.util.*;

public class QuestionBreakKeyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            
            System.out.println("Given number: " + num);
            if(num%10==0){
                System.out.println("The number is Multiple of 10");
                break;
            }
        }while(true);
    }
}

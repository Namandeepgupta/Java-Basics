import java.util.*;

public class PracticeQuestion2s {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        int num;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter Number: ");
            num = sc.nextInt();

            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }

            System.out.print("Enter 1 to repeat and 0 to end = ");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("Even sum : " + evensum);
        System.out.println("Odd sum : " + oddsum);
    }
}

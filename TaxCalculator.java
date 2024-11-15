import java.util.*;

public class TaxCalculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Income = ");
        int Income = sc.nextInt();
        int Tax;
        if(Income<500000){
            Tax = 0;
            System.out.println("You have to pay tax = " + Tax);
        }
        else if (Income>=500000 && Income<=1000000){
            Tax = (int) (Income*0.2);
            System.out.println("You have to pay tax = " + Tax);
        }
        else{
            Tax = (int) (Income*0.3);
            System.out.println("You have to pay tax = " + Tax);
        }
    }
}

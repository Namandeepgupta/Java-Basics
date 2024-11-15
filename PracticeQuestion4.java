import java.util.*;

public class PracticeQuestion4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int a;
        int i = 1;

        System.out.print("Enter number for table: ");
        num = sc.nextInt();
        System.out.println("The table of " + num + " : ");

        do{
            a = num*i;
            System.out.println(num + " * " + i + " = " + a);
            i++;
        }while(i<=10);

    }
}

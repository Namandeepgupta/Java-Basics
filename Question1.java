import java.util.*;

public class Question1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        float average = (A+B+C)/3;
        System.out.println("Average of these three numbers:  " +average);
    }
}

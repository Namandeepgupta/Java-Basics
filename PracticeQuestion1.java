import java.util.*;

public class PracticeQuestion1{
    public static int AverageOfThreeNumber(int a,int b,int c){
        int average = ( a + b + c )/3;
        return average;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of numbers: " + AverageOfThreeNumber(a,b,c)); 
    }
}
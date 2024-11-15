import java.util.*;

public class PassOrFail {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks: ");
        int Marks = sc.nextInt();
        String Result = ( Marks>=33 ) ? "Pass" : "Fail" ;
        System.out.println("Result: " + Result );
    } 
}

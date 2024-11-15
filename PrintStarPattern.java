import java.util.*;

public class PrintStarPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int i = sc.nextInt();
        for(int line=1 ; line<=i ; line++){
            for(int j=1 ; j<=line ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
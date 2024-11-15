import java.util.*;

public class FloydsTriangle {
    public static void FloydsTriangle(int counter,int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the counter value: ");
        int counter = sc.nextInt();
        System.out.print("Enter the number of line: ");
        int n = sc.nextInt();
        FloydsTriangle(counter,n);
    }
}

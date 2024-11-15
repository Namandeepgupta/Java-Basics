import java.util.*;

public class A01TrianglePattern {
    public static void A01TrianglePattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(((i+j)%2)==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of line: ");
        int n = sc.nextInt();
        A01TrianglePattern(n);
    }
}

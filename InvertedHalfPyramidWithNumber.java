import java.util.*;

public class InvertedHalfPyramidWithNumber {
    public static void HalfPyramidWithNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line: ");
        int n = sc.nextInt();
        HalfPyramidWithNumber(n);
    }
}

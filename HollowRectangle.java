import java.util.*;

public class HollowRectangle {
    public static void PrintHollowRectangle(int totalrow, int totalcol){
        for(int i=1; i<=totalrow; i++){
            for(int j=1; j<=totalcol; j++){
                if(i==1 || j==1 || i==totalrow || j==totalcol){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of rectangle: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        PrintHollowRectangle(row,col);
    }
}

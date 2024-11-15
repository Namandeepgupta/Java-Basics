import java.util.*;

public class Print1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Range: ");
        int range = sc.nextInt();
        while(count <= range){
            System.out.println(count);
            count++;
        }
    }
}

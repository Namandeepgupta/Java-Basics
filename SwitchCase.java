import java.util.*;

public class SwitchCase {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        switch(number) {
            case 1 :  
            System.out.println("Samosa");
            break;
            case 2 :
            System.out.println("Burgar");
            break;
            case 3 : 
            System.out.println("Mango shake");
            break;
            default : 
            System.out.println("Sorry, We don't have this item");
        }
    }
}

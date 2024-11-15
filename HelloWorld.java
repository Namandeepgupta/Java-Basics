import java.util.*;

public class HelloWorld {
    public static void PrintHelloWorld(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print : ");
        int times = sc.nextInt();
        for(int i=1; i<=times; i++){
            System.out.println("Hello World!");
        }
    }
    public static void main(String args[]){
        PrintHelloWorld();
    }
}

import java.util.*;

public class FunctionOverloadingParameter {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(3,4));
        System.out.println(sum(6,4,10));
    }
}

import java.util.*;

public class ReverseANumber{
    public static void main(String args[]){
        int num = 25112002;
        while(num>0){
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num/=10;
        }
    }
}
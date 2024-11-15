public class ReversebyLoop {
    public static void main(String args []){
        for(int num = 25112002; num>0; num/=10){
            int lastdigit = num%10;
            System.out.print(lastdigit);
        }
    }
}

public class TypePromotion1 {
    public static void main(String args[]){
        char a='a';
        //char b='b';
        //System.out.println(a-b);

        short b=5;
        byte c=25;
        byte bt=(byte)(a+b+c);
        System.out.println(bt); 
    }
}

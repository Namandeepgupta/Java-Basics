import java.util.*;

public class FindBionomialCoeffecient {
    public static int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int BioCoe(int n,int r){
        int f = 1;
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        f = (fact_n)/((fact_r)*(fact_nmr));
        return f;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for bionomial coeffecient: ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(BioCoe(n,r));
    }
}

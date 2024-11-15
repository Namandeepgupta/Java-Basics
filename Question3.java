import java.util.*;

public class Question3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cost of a pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("Cost of a pen = ");
        float pen = sc.nextFloat();
        System.out.print("Cost of an eraser = ");
        float eraser = sc.nextFloat();
        float totalcost = pencil+pen+eraser;
        System.out.println("Total cost of the items = " +totalcost);
        float includegst = (0.18f*totalcost)+totalcost;
        System.out.println("Total cost after including GST = " +includegst);
    }
}
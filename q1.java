//-----------------------datatype & variables questionsss---------------------------
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        // //average 
        // int a = obj.nextInt();
        // int b = obj.nextInt();
        // int c = obj.nextInt();
        // float avg = (a+b+c)/3f;
        // System.out.println(avg);
        
        // //area of square
        // int side = obj.nextInt();
        // int area = side*side;
        // System.out.println(area);

        //total cost of items
        float pencil = obj.nextFloat();
        float pen =obj.nextFloat();
        float eraser = obj.nextFloat();
        float total_cost = pencil+pen+eraser;
        float bill = (total_cost + (0.18f*total_cost));
        System.out.println(bill);

        obj.close();
    }
}

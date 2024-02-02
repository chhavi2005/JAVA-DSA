import java.util.*;
public class input {
    public static void main(String[] args) {
        //Scanner - predefined class
        //obj- Scanner class ka object 
        //system.in se input le rhe h jese system.out se output krate h 
        //obj.next se object ke through ek next function call hua jiske through input capture hoga ek input naam ke string variable me
        Scanner obj = new Scanner(System.in);

        String input = obj.next();  //next sirf ek word input leta h 
        System.out.println(input);

        String input2 = obj.nextLine(); //nextLine poori line input leta h 
        System.out.println(input2);

        int num = obj.nextInt(); //nextInt integer input capture krta h 
        System.out.println(num);

        //nextFloat(),nextBoolean(),so on................

        double dob = obj.nextDouble();
        System.out.println(dob);


        obj.close();  // object close krna pdta h taaki kuch leak naa ho
    }
}

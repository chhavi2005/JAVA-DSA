import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //positive/negative
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        if(num>=0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }

        //fever
        System.out.print("Enter temperature: ");
        double temp = obj.nextDouble();
        if(temp>100){
            System.out.println("YOU HAVE FEVER");
        }
        else{
            System.out.println("YOU DON'T HAVE FEVER");
        }
        
        //leap year
        System.out.print("Enter year: ");
        int year= obj.nextInt();
        if(((year%4==0) && (year%100!=0))||((year%100==0) && (year%400==0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not leap year");
        }
        obj.close();
    }
}

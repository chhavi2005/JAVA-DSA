import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {    
        //print reverse of number

        /* Logic
        agar last digit chahiye ho to modulo (n%10)
        agar last digit hatana ho to divide (n/10)
        */
    
        Scanner obj = new Scanner(System.in);
        // System.out.println("divide = "+ n/10);
        // System.out.println("modulo = "+ n%10);
        // System.out.print("Enter n - ");
        // int n = obj.nextInt();
        // System.out.print("reversed number is:- ");
        // while(n>0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }


        //reverse the given number
        /*
        to save the reverse number - rev = (rev*10) +lastDigit
        */

        System.out.print("Enter n - ");
        int n = obj.nextInt();
        System.out.print("Reversed number is:- ");
        int rev=0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;         //n chota hojayega
        }
        System.out.print(rev);

        obj.close();
    }
}

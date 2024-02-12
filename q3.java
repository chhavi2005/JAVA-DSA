import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        //prime number or not 
        Scanner obj = new Scanner(System.in);
        // System.out.print("Enter a number:- ");
        // int n = obj.nextInt();
        // int count=0;
        // for(int i = 1; i<=n;i++){
        //     if(n%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println(n+" is prime");
        // }
        // else{
        //     System.out.println(n+" is not prime");
        // }

        // //program that reads a set of integers and then prints the sum of the even and odd integers
        // int number;
        // int choice;
        // int evenSum=0;
        // int oddSum=0;
        // do{
        //     System.out.print("Enter the number:-");
        //     number=obj.nextInt();
        //     if(number%2==0) {
        //         evenSum+=number;
        //     }
        //     else{
        //         oddSum+=number;
        //     }
        //     System.out.print("Do you want to continue? Press 1 for yes or 0 for no :- ");
        //     choice=obj.nextInt();
        // }while(choice==1);
        
        // System.out.println("Sum of even numbers: "+evenSum);
        // System.out.println("Sum of odd numbers: "+oddSum);

        //factorial 
        System.out.print("Enter a number:-");
        int num = obj.nextInt();
        int fact = 1;
        for(int i = 1 ;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial is:-" + fact);


        //multiplication table of n
        int n = obj.nextInt();
        for(int i=1; i<11;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        obj.close();
    }
}

import java.util.Scanner;

public class functions {
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }
    //if int return type
    // public static int printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return 3;
    // }
    
    //parameters inside functions are functions ke input    
    public static void calculateSum(int num1,int num2){ // function(parameters) or formal parameters -  parameters ka naam kuch bhi rkh skte h function call
        int sum = num1+num2;
        System.out.println("sum is:- " + sum);
    }

    public static void main(String[] args) {
        printHelloWorld(); //function call
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        calculateSum(a, b);          //function(arguments) or actual parameters

        obj.close();
    }

}

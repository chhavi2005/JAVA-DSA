import java.util.*;
public class array {
    public static void main(String[] args) {
        // array initialise 
        // int arr[] = new int[10];
        // int numbers[]={1,2,3};
        // String fruits[]={"apple","mango","banana"};

        //array input
        int marks[] = new int[100];
        Scanner obj = new Scanner(System.in);
        marks[0]=obj.nextInt();
        marks[1]=obj.nextInt();
        marks[2]=obj.nextInt();

        System.out.println("physics :- "+marks[0]);
        System.out.println("chemistry :- "+marks[1]);
        System.out.println("biology :- " +marks[2]);

        //update array element
        // marks[2]= 100;
        // System.out.println("chemistry updated marks:- "+marks[2]);

        //operations on array 
        // marks[2] = marks[2] + 1;
        // System.out.println("chemistry updated marks:- "+marks[2]);

        //average with array
        int average = ((marks[0]+marks[1]+marks[2])/3);
        System.out.println("average of marks :- "+average);
        obj.close();
    }
    
}

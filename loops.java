import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // //while - print 1 to 10
        // int counter = 1;
        // while(counter <11){
        //     System.out.println(counter);
        //     counter++;
        // }
        // //while - sum of n natural numbers
        // int i = 1;
        // int sum =0;
        // int n = obj.nextInt();
        // while(i<=n){
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.println(sum);


        //for loop -writing something 10 times
        // for(int j=1;j<=10;j++){
        //     System.out.println("Hello Chhavi");
        // }

        

        //do while = print 1 to 10
        int counter = 1;
        do{
            System.out.println(counter);
            counter++;
        }while(counter<=10);
        obj.close();
    }
}

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        //for loop - square pattern
        // for(int i = 1;i<=4;i++){
        //     System.out.println("****");
        // }

        //while loop-square pattern
        // int i =1;
        // while(i<=4){
        //     System.out.println("****");
        //     i++;
        // }

        //half pyramid pattern - stars
        // for(int line = 1;line<=4;line++){
        //     //one line
        //     for(int star = 1; star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // //inverted star pattern
        Scanner obj = new Scanner(System.in); 
        int n = obj.nextInt();
        // for (int line = 1;line<=n;line++){
        //     for(int star = 1; star<=n-line+1;star++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }
        
        // //half pyramid pattern - numbers
        // for(int line = 1; line<=n;line++){
        //     for (int i = 1;i<=line;i++){
        //         System.out.print(i);
        //     }
        // System.out.println();
        // }
    
        //half pyramid pattern - characters
        char ch = 'A';
        for(int line = 1;line<=n;line++){
            for(int i = 1;i<=line;i++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        obj.close();
    }
}

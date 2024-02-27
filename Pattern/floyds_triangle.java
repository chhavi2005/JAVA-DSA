public class floyds_triangle {
    public static void floydsTriangle(int n){                   //n - no of lines
     int counter = 1;
    //for loop - no of lines
     for(int i = 1; i<=n;i++){
        //for loop - counter/numbers printing
        for(int j = 1;j<=i;j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }   
    }
    public static void main(String[] args) {
        //function calling
        floydsTriangle(5);
    }
}

public class inverted_rotated_halfpyramid{
    public static void halfPyramid(int n){          //n is no.of lines
        //for loop - rows
        for(int i = 1;i<=n;i++){
            //for loop - spaces
            for(int j = 1; j<=n-i;j++){          //n-i for spaces are decreasing as lines increasing
                System.out.print(" ");
            }
            //for loop - stars
            for(int j = 1;j<=i;j++){                //stars are as line no.
                System.out.print("*");
            }
        System.out.println();

        }
    }
    public static void main(String[] args) {
        halfPyramid(4);
    }
}
public class hollowRectangle {
    public static void hollow_Rectangle(int totRows , int totCols){
        //outer loop - rows
        for(int i = 1; i<=totRows;i++){
            //inner loop - cols
            for(int j = 1; j<=totCols;j++){
                //boundary condition 
                if(i==1||i==totRows||j==1||j==totCols){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //function calling
        hollow_Rectangle(4,7);
    }
}

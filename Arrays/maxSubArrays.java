public class maxSubArrays {
    public static void max(int numbers[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<=numbers.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){
                    sum = sum+numbers[k];
                    System.out.print("sum of sub arrays: "+sum);
                }
            }
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
    }
}

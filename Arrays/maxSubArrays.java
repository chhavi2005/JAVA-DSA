public class maxSubArrays {
    public static void max(int numbers[]){
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                currentsum=0;
                for(int k = start;k<=end;k++){
                    currentsum = currentsum+numbers[k];
                }
                System.out.println(currentsum);
                if(maxSum<currentsum){
                    maxSum=currentsum;
                }
            }
        }
        System.out.println("max of subarrays:"+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10}; 
        max(numbers);
    }
}

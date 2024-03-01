public class subArrays {
    //continuous part of an array   
    //no of subarrays = n(n+1)/2

    public static void sub(int numbers[]) {
        // start
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            int sumOfSubArrays = 0; // Initialize sum for the current subarray
            // end
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                // start to end print and calculate sum
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sumOfSubArrays += numbers[k]; // Add current element to sum
                }
                System.out.println("Sum Of Sub Array : " + sumOfSubArrays);
                sumOfSubArrays = 0; // Reset sum for the next subarray
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        sub(numbers);
        int numOfSubArrays = (numbers.length*(numbers.length+1)/2);           //to calcultate number of subarrays in an array = n(n+1)/2
        System.out.println("Number of subarrays in numbers[]= "+numOfSubArrays);
    
    }
}

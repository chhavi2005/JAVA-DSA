public class arrayQs {
    //largest and smallest number in array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;     //largest ki sabse choti value rakhdi so that agar isse bda koi b integer hoga it will be easier to detect.
        //-infinity = minvalue +infinity = maxvalue

        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        //initialising array
        int numbers[]={1,2,6,3,5};
        //function call
        System.out.println("Largest no is= "+getLargest(numbers));
    }
}

public class sumOfDigits {
    //sum of digits method
    public static int sumDigits(int n){
        int sum = 0;
        int num = n;
        while(num>0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        //function calling
        System.out.println(sumDigits(456));
    }
}

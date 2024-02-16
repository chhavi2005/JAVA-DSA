public class palindrome {
    public static boolean isPalindrome(int num){
        int rev = 0;
        int originalNum = num;
        while(num>0){
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num = num/10;
        }
        if(rev == originalNum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num  = 121;
        if(isPalindrome(num)){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}

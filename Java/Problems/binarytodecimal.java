public class binarytodecimal {
    //binary to decimal conversion
    //last digit chahiye ho to modulo by 10
    //last digit hatana ho to divide by 10
    public static void binToDec(int binNum){
        int inputNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int lastDigit = binNum % 10;  //to take the last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10; //last digit remove
        }
        System.out.println("Decimal of "+ inputNum + " is " + decNum);
    }
    public static void main(String[] args) {
        //Binary To Decimal - Function Calling

        binToDec(111);
    }
}

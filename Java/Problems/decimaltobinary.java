public class decimaltobinary {
    //decimal to binary
    public static void decToBin(int decNum){
        int inputNum = decNum;
        int pow = 0;
        int binNum =0;
        while(decNum>0){
            int rem = decNum%2; //to get remainder
            binNum = binNum + (rem*(int)Math.pow(10,pow)); //to add remainders to its proper place starting from unit's place
            pow++;
            decNum = decNum/2; //divide to reduce the number
        }
        System.out.println("Binary Number of "+ inputNum + " is " + binNum);
    }
    public static void main(String[] args) {
        //decimal to binary function call
        decToBin(5);
    }
}

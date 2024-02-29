public class PairsInArray {
    public static void printPairs(int numbers[]){
        int tp = 0; //total pairs       //tp = n(n-1)/2
        //for 1st number in pair 
        for(int i = 0; i<numbers.length;i++){
            int current = numbers[i];
             //for 2nd number in pair
            for(int j = i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs = "+tp);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
       printPairs(numbers);

       //time complexity - O(n2)
    }
}

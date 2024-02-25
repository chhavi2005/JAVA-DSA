public class linearSearch {
    public static int linear(int numbers[],int key){
        for(int i =0;i<numbers.length;i++){      //index 0 se array ki length tk
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key = 20;

        //function call
        int index = linear(numbers,key);
        if(index == -1){
           System.out.println( "index not found");
        }
        else{
            System.out.println("key is at index = "+index);
        }
    }
}

public class callByValue {
    public static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a after swap is "+a);
        System.out.println("b after swap is "+b);
    }    
    public static void main(String[] args) {
        //swapping program without function
        // //before swap
        int a = 5;
        int b = 10;
        // //after swap
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("a after swap is "+a);
        // System.out.println("b after swap is "+b);

        //with function
        swap(a,b);
    }
}

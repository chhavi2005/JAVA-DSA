public class functionOverloading {

    //functions can be of same name - if parameters datatype is different or if no. of parameters are different

    //function overloading using parameters
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum (int a,int b,int c){
        return a+b+c;
    }

    //function overloading using datatypes
    public static double sum(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(5,3,3));

        System.out.println(sum(8.2,5.8));
    }
}

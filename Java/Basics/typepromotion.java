public class typepromotion {
    public static void main(String[] args) {
        /*
           1) --->>>> byte,char,short are automatically converted to int while performing expressions
        */
        char a = 'a';
        char b = 'b';
        // char c = b-a; cant convert from int to char
        int c = b-a; //converted expression to char but no sense of answer
        System.out.println(c);
        // System.out.println(b-a);



        /*
           2) --->>>> if largest operand present is long,double,or float 
           whole expression is converted to them respectively.
        */
        long h = 254343;
        int j = 14;
        float k = 55.554f;
        double l = 456.464464;
        // float sum = j+k+l;    //automatically expression was converted to double 
        double sum = h+j+k+l;
        System.out.println(sum);       
    }
}

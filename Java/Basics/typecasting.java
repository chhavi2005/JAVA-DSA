public class typecasting {
    public static void main(String[] args) {
        //-----lossy conversion--------
        // float a = 25.23541f;
        // int b = a;
        // System.out.println(b);

        //typecasting - explicit
        float a = 25.23541f;
        int b = (int) a;  //converted a that is float to int
        System.out.println(b);

        //char to int
        char ch = 'A';   //prints 65 (ASCII CODE) 
        int c = ch;
        System.out.println(c);
        char ch2 = 'a';    //prints 97(ASCII CODE)
        int c2 = ch2;
        System.out.println(c2);
      }
}

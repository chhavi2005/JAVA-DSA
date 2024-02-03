public class typeconversion {
    
    public static void main(String[] args) {
        // storing int value to long possible = type conversion - implicit
        int a = 20;
        long b = a;
        System.out.println(b);

        //not possible = lossy conversion/data loss - not done by java itself - explicit/narrowing
        // long c = 2;
        // int d = c;
        // System.out.println(d);

        // byte->short->int->float->long->double
        // type conversion not possible in boolean
        //2 conditions: type compatible, destination size>source size

    }
}

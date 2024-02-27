public class if_else {
    public static void main(String[] args) {
        //if else
        int a = 1,b = 3,c= 6;
        if (a>=b && a>=c){
            System.out.println("largest is a ");
        }
        else if(b>=a && b>=c){
            System.out.println("largest is b");
        }
        else{
            System.out.println("largest is c");
        }

        //ternary if else
        int number = 55;
        String larger = (number>50)?"True":"False";
        System.out.println(larger);

        int num = 4;
        String evod= ((num%2)==0)?"Even":"Odd";
        System.out.println(evod);

        int marks = 31;
        String check = (marks>=33)?"Pass":"Fail";
        System.out.println(check);
    }
}

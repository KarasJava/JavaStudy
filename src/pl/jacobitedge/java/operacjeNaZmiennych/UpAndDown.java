package pl.jacobitedge.java.operacjeNaZmiennych;

public class UpAndDown {
    public static void main(String[] args) {


        int number = 0;
        System.out.println(number);

        number ++;

        System.out.println(number);

        number --;


        // examples

        //increment postfix

        int x = 5;  //5
        x++;        // x will be increment after passing this line, current value is 5
        System.out.println(x); //6


        //decrement postfix

        int y = 5;  //5
        y--;        // y will be decrement after passing this line, current value is 5
        System.out.println(y); //4


        //increment prefix

        int c = 5;  //5
        System.out.println(++c);        // c will be increment immediately while you run code, it gives  6 already in this line
        System.out.println(c); //6


        //decrement prefix

        int d = 5;  //5
        System.out.println(--d);        // c will be decrement immediately while you run code, it gives  4 already in this line
        System.out.println(d); //4


    }
}

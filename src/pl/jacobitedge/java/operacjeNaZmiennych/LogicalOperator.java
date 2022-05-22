package pl.jacobitedge.java.operacjeNaZmiennych;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("If x is lower then 0 or y is grater then 0");

        // or (one of the expression must be a true)  true false    or true true   or false true

        System.out.println(x < 0 || y >0);

        // and ( 2 expression must be a true)

        System.out.println(x < 0 && y >0);

    }
}

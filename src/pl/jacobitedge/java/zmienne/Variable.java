package pl.jacobitedge.java.zmienne;

public class Variable {
    public static void main(String[] args) {

        // variables datatype variableName = "assignment"
        String name = "Jan";
        String surnameName= "Kowal";
        int age = 20;

        System.out.println(name + " " + surnameName + " " + age);


        var test = "sample text";



    }

}

class Variables2 {
    public static void main(String[] args) {
        final double numPi=3.14;
        final int final2;
        final2=3;    // we can assign number to final2, it's first assign
//        numPi=8;     // error, the variable was set
    }
}

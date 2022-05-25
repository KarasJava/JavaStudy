package pl.jacobitedge.java.slowoThis;

import java.util.Random;

public class Diece {
    int top;

    public Diece(int top) {
        this.top = top;
    }

    public Diece() {
        roll();
    }



    void roll (){
        Random random = new Random();
        this.top = random.nextInt(0,6) +1;
        System.out.println(top);
    }


}

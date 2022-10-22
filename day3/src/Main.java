package day3.src;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {

        ArrayList<Integer> t1 = Challenge.fibonacci(10);

        ArrayList<Integer> t2 = Challenge.fibonacci(100);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }

}

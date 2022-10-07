package day3.src;

import java.util.ArrayList;

public class Challenge {
    public static ArrayList<Integer> fibonacci(int n) {

        var fibonacciSequence = new ArrayList<Integer>();

        if (n > 1) {
            int a = 0;

            int b = 1;

            fibonacciSequence.add(a);
            fibonacciSequence.add(b);

            for (int i = 0; i < n; i++) {
                var c = a + b;

                a = b;

                b = c;

                fibonacciSequence.add(c);

            }
        } else if (n == 0) {
            fibonacciSequence.add(0);
        } else {
            fibonacciSequence.add(0);
            fibonacciSequence.add(1);

        }

        return fibonacciSequence;
    }
}

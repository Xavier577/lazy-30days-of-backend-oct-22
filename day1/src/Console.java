package day1.src;

import java.util.Scanner;

public class Console {
    public static void log(Object args) {
        System.out.println(args);
    }

    public static String input(String promptMsg) {
        Console.log(promptMsg);
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        in.close();
        return value;
    }
}
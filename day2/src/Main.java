package day2.src;

import java.util.ArrayList;

public class Main {
    public static void main(String... args) {

        ArrayList<String> leapYears = Challenge.leapYear("2020", 3);

        System.out.println(leapYears.toString());
    }
}
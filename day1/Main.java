package day1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String... args) {

        final String userInput = Console.input("Enter your name: ");

        final String msg = Challenge.task(userInput);

        Console.log(msg);

    }

}

class Console {
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

class RegExp {
    public Pattern regExp;

    public RegExp(String regex) {
        regExp = Pattern.compile(regex);
    }

    public boolean test(CharSequence input) {
        Matcher matcher = regExp.matcher(input);
        return matcher.find();
    }
}

class Challenge {
    public static String task(String name) {

        final RegExp specialCharaterPattern = new RegExp("[^A-Za-z0-9]");

        final boolean containsSpecialChar = specialCharaterPattern.test(name);

        final String[] acceptableNamePatterns = { "Bolu", "bolu", "Odun", "odun" };

        final boolean nameIsBoluOrOdun = Arrays.stream(acceptableNamePatterns).anyMatch(name::matches);

        if (containsSpecialChar) {
            return "Please remove all spaces or special characters";
        } else if (nameIsBoluOrOdun) {
            final String responseName = name.matches("bolu") ? "Bolu" : name.matches("odun") ? "Odun" : name;
            return String.format("Welcome %s", responseName);
        } else {
            return String.format("it is nice to meet you, %s", name);
        }

    }
}
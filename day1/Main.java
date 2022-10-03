package day1;

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
        final RegExp namePattern = new RegExp("(B|b)olu|(O|o)dun");

        final RegExp specialCharaterPattern = new RegExp("[^A-Za-z0-9]");

        final boolean containsSpecialChar = specialCharaterPattern.test(name);

        final boolean isBoluOrOdun = namePattern.test(name);

        if (containsSpecialChar) {
            return "Please remove all spaces or special characters";
        } else if (isBoluOrOdun) {
            String responseName = name == "bolu" ? "Bolu" : "Odun";
            return String.format("Welcome Bolu or Odun", responseName);
        } else {
            return String.format("it is nice to meet you, %s", name);
        }

    }
}
package day1.src;

import java.util.Arrays;

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
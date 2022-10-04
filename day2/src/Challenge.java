package day2.src;

import java.util.ArrayList;

class Challenge {
    public static ArrayList<String> leapYear(String year, int leapYearsAfter) {
        // a year that is divible by 100 and 400 is a leap year
        try {
            /** This is the divisor for leap year when not-end-of-century */
            int LEAP_YEAR_DIVISOR_NEOC = 4;
            int numericYear = Integer.parseInt(year);
            int remainder = numericYear % LEAP_YEAR_DIVISOR_NEOC;
            int currLeapYear = numericYear;

            var leapYears = new ArrayList<String>();

            if (remainder != 0) {
                currLeapYear = numericYear - remainder;
            }

            for (int i = 0; i < leapYearsAfter; i++) {
                currLeapYear = currLeapYear + LEAP_YEAR_DIVISOR_NEOC;
                leapYears.add(Integer.toString(currLeapYear));
            }

            return leapYears;

        } catch (NumberFormatException ex) {
            System.err.println("Argument year must be a numberic string");
        }
        return null;
    }
}
package day1.src;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
package day1.src;

public class Main {

    public static void main(String... args) {

        final String userInput = Console.input("Enter your name: ");

        final String msg = Challenge.task(userInput);

        Console.log(msg);

    }

}
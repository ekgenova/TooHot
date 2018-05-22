import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IsItTooHot isItTooHot = new IsItTooHot();

    /*Scanner for user input. Takes an integer for temperature and y or n for "is it summer?"
             */
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input the temperature right now.");
        int temperature = inputScanner.nextInt();
        System.out.println("Is it summer? true/false");
        Boolean isItSummer = inputScanner.nextBoolean();

        System.out.println(isItTooHot.isItTooHot(temperature,isItSummer));
    }
}

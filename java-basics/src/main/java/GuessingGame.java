import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNumber = 5;

        System.out.println("Enter a number between 1 and 10");
        int guessedNumber = input.nextInt();

        if(guessedNumber == secretNumber) {
            System.out.println("You Win");
        } else {
            System.out.println("Sorry try again");
        }

    }
}

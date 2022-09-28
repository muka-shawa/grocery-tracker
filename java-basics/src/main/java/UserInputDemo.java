import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("Lets calculate the area of a rectangle");
        System.out.println("Enter the length");
        int length = input.nextInt();
        System.out.println("Enter width");
        int width= input.nextInt();

        int area = length * width;

        System.out.println("Thanks" + name + "The area you are calculating is: " + area);
    }
}

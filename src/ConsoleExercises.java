import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("You entered: " + num);

        System.out.print("Enter 3 words: ");
        scanner.nextLine();
        String userString = scanner.nextLine();

        System.out.printf("%s.%n", userString);

        System.out.print("Write a sentence: ");
        scanner.nextLine();
        String userSentence = scanner.nextLine();

        System.out.printf("%s.%n", userSentence);

        System.out.println("Width of room: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Length of room: ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.printf("The perimeter of the room is %d. The area is %d.%n", (2 * length) + (2 * width), length * width);







    }
}

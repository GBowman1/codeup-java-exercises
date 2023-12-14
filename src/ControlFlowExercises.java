import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

        int a = 100;
        do {
            a -= 5;
            System.out.println("a is : " + a);
        } while (a > -10);

        long b = 2;
        do {
            b *= b;
            System.out.println("b is : " + b);
        } while (b < 1000000);



        for (int num = 1; num <= 100; num++) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println("num is: " + num);
        }
        }


        Scanner scanner = new Scanner(System.in);
// changed to match code from class review
        while (true) {
            System.out.println("Enter a number: ");
            int userInput = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for( int input = 1; input <= userInput; input++ ) {
                System.out.printf("%-6d | %-7d | %d%n", input, input*input, input*input*input);
            }
            System.out.println("Would you like to see a table for another number");
            String resp = scanner.next();
            if (resp.equalsIgnoreCase("no")) {
                    break;
            }
            System.out.println("Restarting...");
        }

// changed code to match class review
        while (true) {
            System.out.println("Welcome to the Letter Grade-inator\nPlease enter a numeric grade:");
            int userGrade = scanner.nextInt();
            System.out.print("That's a(n) ");
            if (userGrade >= 88) {
                System.out.println("A!");
            } else if (userGrade >= 80) {
                System.out.println("B!");
            } else if (userGrade >= 67) {
                System.out.println("C!");
            } else if (userGrade >= 60) {
                System.out.println("D!");
            } else {
                System.out.println("F!");
            }

            System.out.println("Would you like to convert another grade? [yes/no]");
            String resp = scanner.next();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Restarting...");
        }


    }


}

import java.util.Scanner;

public class ConsoleIOLec {
    public static void main(String[] args) {
//        System.out.print("line 1");
//        System.out.print("line 1 still\n");
//        System.out.println("line 2");

//        System.out.format("");
        String name = "Garrett";
        int num = 3;
        float pi = 3.14F;
        System.out.printf("Hello, my name is %s, and my fav num is %d and %.2f.%n", name, num, pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter something: ");
        String userInput = scanner.next();
// scanner next stops at white space
//        scanner.nextLine stops at new line "enter"
        System.out.println("you entered: --> \"" + userInput + "\" <---");

//        scanner can capture more then strings
//        int = nextInt
//        double = nextDouble

//        scanner.nextLine()
//        var = scanner.nextLine 1 way to skip and input

//        sanner.useDelimiter("\n); skips next line


    }
}

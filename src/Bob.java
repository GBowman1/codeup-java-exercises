import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask bob a question");
        while (true){
        String userPrompt = scanner.nextLine();

        if (userPrompt.endsWith("?")) {
            System.out.println("Sure.");
        } else if (userPrompt.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userPrompt.equals("")) {
            System.out.println("Fine. Be that way!");
        } else if (userPrompt.equals("stop")) {
            break;
        } else {
            System.out.println("Whatever.");
        }

        }
    }
}

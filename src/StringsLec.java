import java.util.Scanner;

public class StringsLec {
    public static void main(String[] args) {
        System.out.println("con" + "cat");

        String con = "con";
        System.out.println(con.concat("cat"));
        System.out.println("con".concat("cat"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("whats your name?");
        String name = scanner.next();
        if(name.startsWith("G")){
            System.out.println("mine starts with G aswell");
        }
        if(name.endsWith("t")){
            System.out.println("mine ends with t aswell");
        }
        if(name.startsWith("G") && name.endsWith("t") && name.equals("Garrett")) {
            System.out.println("We have the same name");
        }
        if(name.startsWith("G") && name.endsWith("t") && !name.equals("Garrett")) {
            System.out.println("Thats a wierd way to spell Garrett");
        }


        String sample = "\nI Like Turtles.   Donkey Rattle.   ";
        System.out.println(sample.charAt(9));
        System.out.println(sample.substring(1,16)); // noninclusive max
        System.out.println(sample.indexOf("turtles"));
        System.out.println(sample.lastIndexOf("."));
        System.out.println(sample.length());
        System.out.println(sample.replace("rattle", "kong"));
        System.out.println(sample.toLowerCase());
        System.out.println(sample.toUpperCase());
        System.out.println(sample.trim());



    }
}

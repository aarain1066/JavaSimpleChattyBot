package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remThree = scanner.nextInt();
        int remFive  = scanner.nextInt();
        int remSeven = scanner.nextInt();


        //System.out.println(10 / (2 + 2) + 4 * 8);

        int yourAge = (remThree * 70 + remFive * 21 + remSeven * 15) % 105;
        // reading all remainders

        System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
    }
}

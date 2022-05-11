import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long originalNumber = scanner.nextLong();
        System.out.println((originalNumber % 100) / 10 );
    }
}
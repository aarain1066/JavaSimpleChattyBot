import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeOneHours = scanner.nextInt() * 3600L;
        int timeOneMinutes = scanner.nextInt() * 60;
        int timeOneSeconds = scanner.nextInt();

        long timeTwoHours = scanner.nextInt() * 3600L;
        int timeTwoMinutes = scanner.nextInt() * 60;
        int timeTwoSeconds = scanner.nextInt();

        long timeOne = timeOneHours + timeOneMinutes + timeOneSeconds;
        long timeTwo = timeTwoHours + timeTwoMinutes + timeTwoSeconds;


        System.out.println(timeTwo - timeOne);
        // put your code here
    }
}
import java.util.Scanner;

public class IT24101252Lab6Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sumOfSquares = 0;

        while (true) {
            System.out.print("Enter a positive number (or -99 to stop): ");
            int number = scanner.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input! Please enter a positiveinteger of -99 to terminate ");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("Root Mean Square (RMS): " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

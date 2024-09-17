import java.util.Scanner;

public class IT24101252Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
		System.out.println(" ");
        System.out.println("The numbers entered are: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

package looppatterns;

import java.util.Scanner;

public class SentinelDrills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int n = scanner.nextInt();
            if (n < 0) {
                break;
            }
            System.out.println(n + " is " + (n % 2 == 0 ? "even" : "odd"));
        }

        System.out.print("Now enter a large number: ");
        int m = scanner.nextInt();
        int count = 0;
        while (m > 1) {
            m /= 2;
            count++;
        }
        System.out.println("Divided by two " + count + " times");

        scanner.close();
    }
}

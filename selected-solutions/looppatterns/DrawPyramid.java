package looppatterns;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pyramid size: ");
        int size = scanner.nextInt();

        for (int row = 0; row < size; row++) {
            for (int indent = 0; indent < size - row - 1; indent++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row * 2 + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

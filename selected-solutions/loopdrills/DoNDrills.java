package loopdrills;

public class DoNDrills {
    public static void main(String[] args) {
        System.out.println("Problem 1");
        for (int n = 0; n < 10; n++) {
            System.out.println(n);
        }

        System.out.println("Problem 2");
        for (int n = 10; n >= 0; n--) {
            System.out.println(n);
        }

        System.out.println("Problem 3");
        for (int n = 1; n <= 256; n *= 2) {
            System.out.println(n);
        }

        System.out.println("Problem 4");
        for (int n = 1; n <= 256; n *= 2) {
            System.out.println(n - 1);
        }

        System.out.println("Problem 5");
        for (int n = 1; n < 50; n += 2) {
            System.out.println(Math.sqrt(n));
        }
    }
}

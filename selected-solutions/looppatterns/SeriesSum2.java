package looppatterns;

public class SeriesSum2 {
    public static void main(String[] args) {
        double threshold = 2.0;
        double sum = 0;
        int n;
        for (n = 2; sum <= threshold; n++) {
            sum += 1.0 / n;
        }
        // count is n-3 because we started at 2, and went one past exceeding threshold
        System.out.println("Count: " + (n - 3));
    }
}

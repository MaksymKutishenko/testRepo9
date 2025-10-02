import java.util.Random;

public class RandomProcessor {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Even numbers:");
        for (int n : numbers) {
            if (isEven(n)) {
                System.out.print(n + " ");
            }
        }
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
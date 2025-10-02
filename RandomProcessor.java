import java.util.Random;

public class RandomProcessor {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Generated numbers:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Even numbers:");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
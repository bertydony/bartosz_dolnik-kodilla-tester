import java.util.Random;

public class RandomNumbers {
    int min = 100;
    int max = 0;
    Random random = new Random();

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getNumbers5000();
    }

    public void getNumbers5000() {
        int sum = 0;
        while (sum < 5000) {
            int numbers = random.nextInt(31);
            sum = sum + numbers;
            getMin(numbers);
            getMax(numbers);
            System.out.println(numbers);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
        }
    }

    public void getMin(int random) {
        if (random < min) {
            min = random;
        }
    }

    public void getMax(int random) {
        if (random > max) {
            max = random;
        }
    }
}
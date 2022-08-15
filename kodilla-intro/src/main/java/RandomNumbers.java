import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        int result = 0;
        while (sum > 5000) {
            int numbers = random.nextInt(31);
            sum = sum + numbers;
            result++;
            System.out.println(numbers);
        }
    }
}

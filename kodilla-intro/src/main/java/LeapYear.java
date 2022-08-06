import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok");
        int rok = scanner.nextInt();

        boolean przestepny = true;
        System.out.println("Podaj rok");
        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
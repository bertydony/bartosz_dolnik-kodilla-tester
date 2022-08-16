import java.util.Scanner;

public class Letter {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color (B-blue, R-red, G-green, Y-yellow):");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color) {
                case "B":
                    return "Blue";
                case "R":
                    return "Red";
                case "G":
                    return "Green";
                case "Y":
                    return "Yellow";
                default:
                    System.out.println("Wrong letter, try again");
            }
        }
    }
}
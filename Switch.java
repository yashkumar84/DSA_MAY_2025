import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Valur Of First Number");
        int a = scanner.nextInt();
        System.out.println("Enter The Value of Second Number");
        int b = scanner.nextInt();

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for modulus");
        int choice = scanner.nextInt();
        scanner.close();
        switch (choice) {
            case 1:
                System.out.println("The Answer is " + (a + b));
                break;

            case 2:
                System.out.println("The Answer is " + (a - b));
                break;

            case 3:
                System.out.println("The Answer is " + (a * b));
                break;

            case 4:
                System.out.println("The Answer is " + (a / b));
                break;

            case 5:
                System.out.println("The Answer is " + (a % b));
                break;

            default:
                System.out.println("Please Enter the Correct Choice");
                break;
        }
        String str = "tea";

        double price = switch (str) {
            case "tea" -> 50.0;
            case "coffee" -> 100.0;
            case "drink" -> 70.0;
            case "water" -> {
                int ch = 2;
                yield 20 + ch;
            }
            default -> 0.0;

        };

        System.out.println(price);
    }
}
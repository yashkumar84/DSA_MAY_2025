import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // User Input
        // Scanner
        int a = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Value");
        int b = sc.nextInt();
        System.out.println(b);
        System.out.println("Enter the Float Value");

        float f = sc.nextFloat();
        System.out.println(f);
        System.out.println("Enter the Character");
        char c = sc.next().charAt(0);
        System.out.println(c);
        System.out.println("Enter Your Name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter Your Full Name");
        sc.nextLine();
        String fullName = sc.nextLine(); // \n
        System.out.println(fullName);
    }

}

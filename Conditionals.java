public class Conditionals {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        int c = 90;
        // if (a > b && a > c) {
        // System.out.println("A is Greatest ");
        // } else if (b > a && b > c) {
        // System.out.println("B is Greatest ");
        // } else {
        // System.out.println("C is Greatest");
        // }

        if (a > b) {
            if (a > c) {
                System.out.println("A is Greater");
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println("B is Greater");
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println("C is Greater");
            }
        }

    }

}

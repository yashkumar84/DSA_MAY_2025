public class Oprators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = 18 / 5;
        int g = 18 % 5;

        // Unary Operators
        int h = ++a;
        int j = --a;
        int k = a--;
        System.out.println(h);

        System.out.println(j);
        // ++ , --
        System.out.println(a);

        System.out.println(k);

        // Assignment Operators

        // = , += , -= , /= , *= , %=

        a += 4; // a = a + 4;
        System.out.println(a);
        a -= 2; // a = a - 2;
        System.out.println(a);
        a *= 2; // a = a* 2;
        System.out.println(a);
        a /= 2; // a = a/ 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Conditional Operator
        // > , < , >= , <= , == , !=
        System.out.println(a > b);
        System.out.println(a < b);
        a = 20;
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        c = 50;

        // Logical Operators
        // && , || , !

        System.out.println(a >= b && a > c && a < c);
        System.out.println(!(a > c || a <= b));

        boolean bool = !true;
        boolean gameOver = false;

        // Bitwise Operators

        // & , | , ~ , ^ , << ,>>

        int bit = a ^ 16;
        System.out.println(bit);

    }

}

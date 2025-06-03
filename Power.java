public class Power {
    public static void main(String[] args) {
        int num = 3;
        int exp = 3;

        int res = 1;
        while (exp > 0) {
            res *= num;
            exp--;
        }

        System.out.println(res);
    }

}

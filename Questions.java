public class Questions {
    public static void main(String[] args) {
        int num = 1234567;
        int copy = num;
        int count = 0;
        while (copy != 0) {
            // System.out.println(num % 10);
            copy /= 10;
            count++;
        }
        int i = 1;
        while (num != 0) {
            int divisor = (int) Math.pow(10, count - i);
            System.out.println(num / divisor);
            num = num % divisor;
            i++;
        }

    }

}

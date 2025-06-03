public class Armstrong {
    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 152;
        int copy = num;
        int digits = countDigits(num);

        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum += Math.pow(last, digits);
            num /= 10;
        }

        if (copy == sum) {
            System.out.println("The number is ArmStrong");
        } else {
            System.out.println("The Number is Not ArmStrong");
        }

    }

}

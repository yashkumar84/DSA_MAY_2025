public class SwapDigitsWithPos {
    public static void main(String[] args) {
        int num = 25134;
        int pos = 1;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            ans += pos * Math.pow(10, rem - 1);
            num /= 10;
            pos++;
        }

        System.out.println(ans);
    }

}

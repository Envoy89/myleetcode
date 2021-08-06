package algorithms;

public class ReverseInteger {
    public static int reverse(int x) {
        long result = 0;

        int multiplier = 1;
        int remainder;
        while (x != 0) {
            remainder = x % 10;
            x = x / 10;

            result = result * multiplier + remainder;

            multiplier = 10;
        }

        if (result > Math.pow(2, 31) - 1 || result < -Math.pow(2, 31)) {
            return 0;
        }

        return (int) result;
    }
}

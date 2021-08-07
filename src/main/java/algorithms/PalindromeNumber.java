package algorithms;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            String stringX = Integer.toString(x);
            int xLength = stringX.length();
            for (int i = 0; i < xLength / 2; i++) {
                if (stringX.charAt(i) != stringX.charAt(xLength - i - 1)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}

package algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;

        int currentSubStrLength = 0;
        char[] charArrayFromS = s.toCharArray();
        for (int i = 0; i < charArrayFromS.length; i++) {
            Set<Character> subStr = new HashSet<>();
            if (currentSubStrLength > result) {
                result = currentSubStrLength;
            }
            currentSubStrLength = 0;
            for (int j = i; j < charArrayFromS.length; j++) {
                char c = charArrayFromS[j];
                if (subStr.contains(c)) {
                    break;
                } else {
                    currentSubStrLength++;
                }
                subStr.add(c);
            }
        }

        return Math.max(result, currentSubStrLength);
    }
}

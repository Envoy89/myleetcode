package algorithms;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int max = haystack.length() - needle.length();
        for (int i = 0; i <= max; i++) {
            char c = haystack.charAt(i);

            if (c != needle.charAt(0)) {
                while(i <= max && haystack.charAt(i) != needle.charAt(0)) {
                    i++;
                }
            }

            if (i <= max) {
                int j = i + 1;
                int end = j + needle.length() - 1;
                for (int k = 1; j < end && haystack.charAt(j) == needle.charAt(k); j++, k++);
                if (j == end) {
                    return i;
                }
            }
        }

        return -1;
    }
}

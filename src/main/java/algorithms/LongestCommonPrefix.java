package algorithms;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        int letterId = 0;
        while (true) {
            Character c = null;
            boolean end = false;

            for(String str : strs) {
                boolean canGetStrLetter = str.length() > letterId;
                if (c == null && canGetStrLetter) {
                    c = str.charAt(letterId);
                }
                if (!canGetStrLetter || str.charAt(letterId) != c) {
                    end = true;
                    break;
                }
            }

            if (end) {
                break;
            } else {
                prefix.append(c);
            }

            letterId++;
        }

        return prefix.toString();
    }
}

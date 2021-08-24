package algorithms;

import java.util.*;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Brackets> brackets = new Stack<>();
        for (char c : s.toCharArray()) {
            Brackets b = Brackets.getBracketByName(c);
            if (b != null) {
                brackets.push(b);
            } else {
                b = Brackets.getBracketByPair(c);
                if (brackets.size() == 0 || brackets.lastElement() != b) {
                    return false;
                } else {
                    brackets.pop();
                }
            }
        }
        return brackets.size() == 0;
    }

    private enum Brackets {
        SquareBrackets('[', ']'),
        RoundBrackets('(', ')'),
        CurlyBraces('{', '}');

        private char name;
        private char pair;

        Brackets(char name, char pair) {
            this.name = name;
            this.pair = pair;
        }

        public static Brackets getBracketByName(char name) {
            for (Brackets b : values()) {
                if (b.name == name) {
                    return b;
                }
            }
            return null;
        }

        public static Brackets getBracketByPair(char pair) {
            for (Brackets b : values()) {
                if (b.pair == pair) {
                    return b;
                }
            }
            return null;
        }

        public static boolean isPair(char c) {
            for (Brackets b : values()) {
                if (b.pair == c) {
                    return true;
                }
            }
            return false;
        }
    }
}

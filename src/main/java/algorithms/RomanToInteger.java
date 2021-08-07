package algorithms;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;

        Roman before = null;
        int count = 0;
        Roman r = null;
        for (char rString : s.toCharArray()) {
            r = Roman.findByName(rString);

            if (before == null || before.equals(r)) {
                count++;
                before = r;
            } else {
                if (count == 1 && r != null && r.isMyBefore(before)) {
                    result += r.getMultiplier() - r.getBeforeMultiplier();
                    before = null;
                    count = 0;
                } else {
                    result += count * before.getMultiplier();
                    before = r;
                    count = 1;
                }
            }
        }

        if (r != null && count != 0) {
            result += count * r.getMultiplier();
        }

        return result;
    }

    private enum Roman {

        I(1, 'I', null),
        V(5, 'V', 'I'),
        X(10, 'X', 'I'),
        L(50, 'L', 'X'),
        C(100, 'C', 'X'),
        D(500, 'D', 'C'),
        M(1000, 'M', 'C');

        private int multiplier;
        private char name;
        private Character before;

        Roman(int multiplier, char name, Character before) {
            this.multiplier = multiplier;
            this.name = name;
            this.before = before;
        }

        public static Roman findByName(char name){
            for(Roman r : values()){
                if( r.getName() == name){
                    return r;
                }
            }
            return null;
        }

        public int getMultiplier() {
            return this.multiplier;
        }

        public char getName() {
            return this.name;
        }

        public boolean isMyBefore(Roman before) {
            return this.before != null && before.name == this.before;
        }

        public int getBeforeMultiplier() {
            Roman b = Roman.findByName(this.before);
            return b != null ? b.multiplier: 0;
        }
    }
}

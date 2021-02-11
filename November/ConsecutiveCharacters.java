// https://leetcode.com/explore/featured/card/november-leetcoding-challenge/564/week-1-november-1st-november-7th/3518/
// O(n), single pass
class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 1, sub = 1;
        for(int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i+1)==s.charAt(i))
                sub++;
            else {
                max = Math.max(max, sub);
                sub = 1;
            }
        }
        return Math.max(max, sub);
    }
}
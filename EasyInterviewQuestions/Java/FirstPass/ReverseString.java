// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/
// need to reverse the array in-place!
class ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}
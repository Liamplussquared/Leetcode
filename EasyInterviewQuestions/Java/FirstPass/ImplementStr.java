// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/
// quite memory intensive, lots of comparisons, 
class ImplementStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        
        int index = -1;
        
        for(int i = 0; i <= haystack.length()-needle.length(); i++) {
            if (haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        
        return index;
    }
}
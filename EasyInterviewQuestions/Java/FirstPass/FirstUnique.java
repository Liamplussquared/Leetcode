// https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

class FirstUnique {
    public int firstUniqChar(String s) {
        HashMap<String, Integer> occurences = new HashMap<String, Integer>();
        
        String temp;
        for(int i = 0; i < s.length(); i++) {
            temp = s.substring(i, i+1);
            
            if (occurences.containsKey(temp)) 
                occurences.put(temp, occurences.get(temp)+1);
            else
                occurences.put(temp, 1);
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (occurences.get(s.substring(i, i+1)) == 1)
                return i;
        }
        
        return -1;
    }
}
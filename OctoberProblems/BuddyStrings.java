// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3492/
class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        // lengths differ
        if (A.length() != B.length())
            return false;
        
        // A and B identical strings
        if (A.equals(B)) {
            Set<Character> letters = new HashSet<Character>();
            
            for(int i = 0; i < A.length(); i++) {
                char c = A.charAt(i);
                if (letters.contains(c)) 
                    return true;
                letters.add(c);
            }
            
            return false;
        }
        
        // Strings differ
        ArrayList<Integer> diffIndex = new ArrayList<Integer>();
        
        for(int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i))
                diffIndex.add(i);
        }
        
        if (diffIndex.size() == 2) {
            return (A.charAt(diffIndex.get(0)) == B.charAt(diffIndex.get(1)) && 
                   B.charAt(diffIndex.get(0)) == A.charAt(diffIndex.get(1)));
        }
        
        return false;
        
    }
}
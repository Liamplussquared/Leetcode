// Ugly solution, O(n) tho.
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/
class StringToInteger {
    public int myAtoi(String str) {
        // remove whitespace
        str = str.strip();
        String parsedNum = "";
        char c;
        char operator = '+';
        
        if (str.length() == 0) 
            return 0;
        
        if (str.charAt(0) == '-') {
            operator = '-';
        }
        
        for(int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= '0' & c <= '9') {
                parsedNum += ""+c;
            }
            else if (c == '-' || c == '+') {
                if (i > 0)
                    break;
            }
            else {
                break;
            }
        }
        
        if (parsedNum.length() != 0) {
            try {
                return Integer.parseInt(""+operator+parsedNum);
            } 
            catch (NumberFormatException e) {
                if (operator=='-')
                    return Integer.MIN_VALUE;
                else 
                    return Integer.MAX_VALUE;
            }
        }
        else
            return 0;
    }
}
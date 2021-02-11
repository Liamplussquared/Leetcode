// https://leetcode.com/explore/featured/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3486/
// in place would be faster, using ArrayList probably causing unnecessary memory usage
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null)
            return head;
        
        ListNode current = head;
        
        // retrieve elements of LL & add to ArrayList
        List<Integer> values = new ArrayList<Integer>();
        while(current != null) {
            values.add(current.val);
            current = current.next;
        }
        
        // change values of LL and return its head
        current = head;
        k = k % values.size();
        
        for (int i = values.size()-k; i < values.size(); i++) {
            current.val = values.get(i);
            current = current.next;
        } 
        for (int i = 0; i < values.size()-k; i++) {
            current.val = values.get(i);
            current = current.next;
        }
        
        return head;
    }
}
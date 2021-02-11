// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3493/
class SortList {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        
        if (head == null)
            return null;
        
        // retrieve and add elements to container, then sort 
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        Collections.sort(list);
        
        // replace values in linked list
        current = head;
        for(int i = 0; i < list.size(); i++) {
            current.val = list.get(i);
            current = current.next;
        }
        
        return head;
    }
}
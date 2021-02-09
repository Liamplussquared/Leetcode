// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/771/
class MergeSortedLL {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0); // create new head with dummy value
        ListNode element = head;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                element.next = l1;
                l1 = l1.next;
            }
            else {
                element.next = l2;
                l2 = l2.next;
            }
            element = element.next;
        }
        
        // now at the end of list(s)
        if (l1 == null) {
            element.next = l2;
        }
        else if (l2 == null) {
            element.next = l1;
        }
    
        return head.next; // head stores dummy value, return next node
    }
}
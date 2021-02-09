// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/560/
class ReverseLL {
    public ListNode reverseList(ListNode head) {
        return iterativeReversal(head);
        //return recursiveReversal(head, null);
    }
    
    public ListNode recursiveReversal(ListNode head, ListNode newHead) {
        if (head == null) 
            return newHead;
        
        ListNode nextNode = head.next;
        head.next = newHead;
        
        return recursiveReversal(nextNode, head);
    }
    
    public ListNode iterativeReversal(ListNode head) {
        if (head == null) 
            return head;
        
        ListNode newHead = null;
        ListNode nextNode;
        while(head != null) {
            nextNode = head.next;
            head.next = newHead;
            newHead = head;
            head = nextNode;
        }
        
        return newHead;
    }
}
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
public class linkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        
        ListNode twoStep = head;
        ListNode oneStep = head;
        
        while(twoStep.next != null && twoStep.next.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
            
            if (oneStep == twoStep)
                return true;
        }
        
        return false;
    }
}
class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
    
        start = head.next.next
        tmp = head
        head = head.next
        head.next = tmp
        head.next.next = self.swapPairs(start)
        
        return head
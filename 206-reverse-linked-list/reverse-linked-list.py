class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        
        while curr:
            next_node = curr.next  # Save the next node
            curr.next = prev       # Reverse the current node's pointer
            prev = curr            # Move prev and curr one step forward
            curr = next_node
        
        return prev  # prev is the new head after the loop ends

        
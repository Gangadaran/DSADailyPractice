package ExtraSumMedium;

import org.junit.jupiter.api.Test;

public class AddTwoNumbers {
	/*
	 * function addLinkedLists(l1, l2):
    initialize dummyHead
    initialize current = dummyHead
    initialize carry = 0
    
    while l1 is not null or l2 is not null or carry is not 0:
        initialize sum = carry
        
        if l1 is not null:
            add l1.val to sum
            move l1 to next node
        
        if l2 is not null:
            add l2.val to sum
            move l2 to next node
        
        set carry = sum / 10
        create a new node with value sum % 10
        set current's next to the new node
        move current to the new node
    
    return dummyHead's next node

	 */
	
	@Test
	public void testcase() {
		 ListNode l1 = new ListNode(2);
		    l1.next = new ListNode(4);
		    l1.next.next = new ListNode(4);

		    ListNode l2 = new ListNode(5);
		    l2.next = new ListNode(6);
		    l2.next.next = new ListNode(4);

	}

	class ListNode {
	    int val;
	    ListNode next;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        ListNode current = dummyHead;
	        int carry = 0;

	        while (l1 != null || l2 != null || carry != 0) {
	            int sum = carry;
	            
	            if (l1 != null) {
	                sum += l1.val;
	                l1 = l1.next;
	            }
	            
	            if (l2 != null) {
	                sum += l2.val;
	                l2 = l2.next;
	            }
	            
	            carry = sum / 10;
	            current.next = new ListNode(sum % 10);
	            current = current.next;
	        }
	        
	        return dummyHead.next;
	    }
}

package leetcode.linkedlist;

public class LinkedListCycle_141 {
	/*
	 * based on fast and slow pointer metod
	 */
	public boolean hasCycle(ListNode head) {
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        while(fastPtr!=null && fastPtr.next!=null)
        {
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            if(slowPtr==fastPtr)
                return true;
        }
        return false;
    }

}

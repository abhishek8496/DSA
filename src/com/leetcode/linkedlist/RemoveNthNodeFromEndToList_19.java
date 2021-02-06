package leetcode.linkedlist;

public class RemoveNthNodeFromEndToList_19 {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        //we want to reach at n-1 node actually because we will need to change its value
	        
	        ListNode first=head;
	        ListNode second=head;
	        if(first.next==null) return null;
	        //first we will use 2 pointer method and give the second pointer a lead of 'n' nodes
	        //while the second one reaches last node we will be at n-1 place
	        for(int i=1 ; i <=n ; i++)
	        {
	            second=second.next;
	        }
	        if(second==null)
	        {
	            //we need to remove the first element as this is only possible when we want to remove the last element from back
	            head=head.next;
	            
	        }
	        else
	        {
	            while(second.next!=null)
	            {
	                first=first.next;
	                second=second.next;
	            }
	        }
	        first.next=first.next.next;
	        return head;
	        
	        
	    }
}

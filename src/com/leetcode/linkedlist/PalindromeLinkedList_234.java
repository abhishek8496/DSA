package leetcode.linkedlist;
/**
 * The Time Complexity is O(n) and space complexity is O(1)
 * @author abhishek sharma
 *
 */
public class PalindromeLinkedList_234 {
	 public boolean isPalindrome(ListNode head) {
	        if(head==null || head.next==null)
	            return true;
	        //find middle node first and then reverse the second half
	        ListNode slowPointer=head,fastPointer=head;
	        while(fastPointer!=null && fastPointer.next!=null)
	        {
	            slowPointer=slowPointer.next;
	            fastPointer=fastPointer.next.next;
	        }
	        
	        //now from slowPointer reverse the list and verify 
	        ListNode list2head= reverseList(slowPointer);
	        ListNode temp=list2head;
	        
	        while(list2head!=null && head!=temp)
	        {
	            System.out.println(head.val+"     "+list2head.val);
	            if(head.val!=list2head.val)
	            {
	                return false;
	            }
	            head=head.next;
	            list2head=list2head.next;
	                
	        }
	        return true;
	        
	    }
	    
	    public ListNode reverseList(ListNode node)
	    {
	        ListNode current=node,prev=null,next=null;
	        
	        while(current!=null)
	        {
	            next=current.next;
	            current.next=prev;
	            prev=current;
	            current=next;
	        }
	        return prev;
	        
	    }

}

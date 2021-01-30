package leetcode.linkedlist;

public class OddEvenLinkedList_328 {
	 public static ListNode oddEvenList(ListNode head) {
	        ListNode oddListHead=null,oddListTracker=null,evenListHead=null,evenListTracker=null;
	        int count=1;
	        while(head!=null)
	        {
	            //odd list
	            if(count % 2 == 1)
	            {
	                if(oddListHead==null)
	                {
	                oddListHead=head;
	                oddListTracker=head;
	                }
	                else
	                {
	                oddListTracker.next=head;
	                oddListTracker=oddListTracker.next;
	                }
	            }
	            else
	            {
	                //populate even list
	                if(evenListHead==null)
	                {
	                evenListHead=head;
	                evenListTracker=head;
	                }
	                else
	                {
	                evenListTracker.next=head;
	                evenListTracker=evenListTracker.next;
	                }
	            }
	            head=head.next;
	            count++;
	        }
	        //to make sure there is no loop 
	        if(evenListTracker!=null)
	            evenListTracker.next=null;
	        //after oddlist ends even list starts
	        if(oddListTracker!=null)
	            oddListTracker.next=evenListHead;
	        ListNode tracker=oddListHead;
	        while(tracker!=null)
	        {
	            System.out.println(tracker.val);
	            tracker=tracker.next;
	        }
	        return oddListHead;
	        
	    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		oddEvenList(head);

	}

}

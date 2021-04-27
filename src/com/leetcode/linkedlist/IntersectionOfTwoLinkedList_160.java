package leetcode.linkedlist;

public class IntersectionOfTwoLinkedList_160 {
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
	        ListNode temp=headA,smallerList=null,biggerList=null;
	        int lengthOfListA = numberOfNodes(temp);
	        temp=headB;   
	        int lengthOfListB = numberOfNodes(temp);
	        
	        //now we need to move the greater list and make it parallel to the smaller node
	        //and then make them traverse together.
	        smallerList=(lengthOfListA<lengthOfListB)?headA:headB;
	        biggerList=(lengthOfListA<lengthOfListB)?headB:headA;
	        if(lengthOfListA!=lengthOfListB)
	        {
	            
	            
	            int numberOfTraversalRequired=Math.abs(lengthOfListB-lengthOfListA);
	            
	            while(numberOfTraversalRequired!=0)
	            {
	                biggerList=biggerList.next;
	                numberOfTraversalRequired--;
	            }
	        }
	        
	        //now smaller and bigger are at same level, just traverse parallely
	        //and return the pointers
	        while(smallerList!=null && biggerList!=null)
	        {
	            if(smallerList==biggerList)
	                return smallerList;
	            
	            biggerList=biggerList.next;
	            smallerList=smallerList.next;
	                
	        }
	        return null;
	        
	    }
	    public int numberOfNodes(ListNode node )
	    {
	        int count=0;
	        while(node!=null)
	        {
	           count++;
	           node=node.next;
	        }
	        return count;
	    }

}

package leetcode.heap;

import java.util.PriorityQueue;


public class MergeKSortedLists {
	 public ListNode mergeKLists(ListNode[] lists) {
	        PriorityQueue<Element> queue = new PriorityQueue<Element>((e1,e2)->e1.element.val-e2.element.val);
	        for(int i=0 ; i <lists.length; i++)
	        {
	            if( lists[i]!=null)
	            {
	                queue.add(new Element(i,lists[i]));
	            }
	            
	        }
	        leetcode.heap.ListNode result=null;
			ListNode resultTracker=null;
	        while(!queue.isEmpty())
	        {
	            Element temp=queue.poll();
	            if(lists[temp.row].next != null)
	            {
	                lists[temp.row]=lists[temp.row].next;
	                queue.add(new Element(temp.row,lists[temp.row]));
	            }
	            if(result==null)
	            {
	                result=temp.element;
	                resultTracker=temp.element;
	            }
	            else
	            {
	                resultTracker.next=temp.element;
	                resultTracker=temp.element;
	            }
	        }
	        return result;
	        
	    }



}

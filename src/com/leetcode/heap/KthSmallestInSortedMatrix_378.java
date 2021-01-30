package leetcode.heap;

import java.util.PriorityQueue;
class Element
{
    int val;
    int row;
    int col;
    Element(int val,int row,int col)
    {
        this.val=val;
        this.row=row;
        this.col=col;
    }
}
public class KthSmallestInSortedMatrix_378 {
	 
	    public static int kthSmallest(int[][] matrix, int k) {
	        //initialize a min heap with the values from the first column
	        PriorityQueue<Element> minHeap = new PriorityQueue<Element>((e1,e2)->e1.val-e2.val);
	        for(int i = 0 ; i <matrix.length ; i++)
	        {
	            minHeap.add(new Element(matrix[i][0],i,0));
	        }
	        //now initialize a counter and start extracting min values until we get counter = k
	        int counter=0;
	        //k-1 as we want the kth element to be printed itself
	        while(counter!=k-1)
	        {
	            Element ele = minHeap.poll();
	            if(ele.col+1<matrix.length)
	            {
	                minHeap.add(new Element(matrix[ele.row][ele.col+1],ele.row,ele.col+1));
	            }
	            counter++;
	        }
	        return minHeap.poll().val;
	        
	    }

	public static void main(String[] args) {
		System.out.println(kthSmallest(new int[][]{{1,5,9},{10,11,13},{12,13,15}},8));
	}

}

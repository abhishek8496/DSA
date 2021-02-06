package leetcode.heap;

import java.util.PriorityQueue;

public class MedianFromDataStream_295 {
	/** initialize your data structure here. */
    PriorityQueue<Integer> MAX_HEAP;
    PriorityQueue<Integer> MIN_HEAP;
    public MedianFromDataStream_295() {
        MAX_HEAP = new PriorityQueue<Integer>((e1,e2)->e2-e1);
        MIN_HEAP = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        if(MAX_HEAP.isEmpty() && MIN_HEAP.isEmpty())
        {
            MAX_HEAP.add(num);
        }
        else
        {
            if(num>MAX_HEAP.peek())
            {
                MIN_HEAP.add(num);
            }
            else
            {
                MAX_HEAP.add(num);
            }
        }
        
        //now balance the heaps
        if(Math.abs(MAX_HEAP.size()-MIN_HEAP.size())>1)
        {
            if(MAX_HEAP.size()>MIN_HEAP.size())
            {
                MIN_HEAP.add(MAX_HEAP.poll());
            }
            else
            {
                MAX_HEAP.add(MIN_HEAP.poll());
            }
        }
        
        
    }
    
    public double findMedian() {
        if(MAX_HEAP.size()==MIN_HEAP.size())
        {
            return (MIN_HEAP.peek()+MAX_HEAP.peek())/2.0;
        }
        else
        {
            if(MAX_HEAP.size()>MIN_HEAP.size())
            {
                return MAX_HEAP.peek();
            }
            else
            {
                return MIN_HEAP.peek();
            }
        }
        
    }
}

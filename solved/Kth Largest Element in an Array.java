import java.util.PriorityQueue;

/**
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.
 */


class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.offer(n);
            if(pq.size()>k) pq.poll();
        }
        return pq.peek();
    }
}
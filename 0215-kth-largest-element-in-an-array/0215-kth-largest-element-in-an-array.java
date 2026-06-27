class Solution {
    public int findKthLargest(int[] nums, int k) {
         PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<nums.length;i++)
       {
           heap.add(nums[i]);
       }
       while(k>1)
       {
           heap.poll();
           k--;
       }
       return heap.peek();
    }
}
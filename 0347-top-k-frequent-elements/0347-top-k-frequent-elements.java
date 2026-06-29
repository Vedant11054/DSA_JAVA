class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        class pair
        {
            int first;
            int second;
            pair(int f, int s)
            {
                first =f;
                second =s;
            }
        }
        PriorityQueue<pair>heap=new PriorityQueue<>(
            (a,b)->
            {
                if(a.first!=b.first)
                {
                    return a.first-b.first;
                }
                return a.second-b.second;
            }
        );
        for(int key:map.keySet())
        {
            pair curr=new pair(map.get(key),key);
            if(heap.size()<k)
            {
                heap.add(curr);
            }
            else if(curr.first>heap.peek().first)
            {
                heap.poll();
                heap.add(curr);
            }
        }
        int ans[]=new int[k];
        for(int i=k-1;i>=0;i--)
        {
            ans[i]=heap.poll().second;
        }
        return ans;
    }
}
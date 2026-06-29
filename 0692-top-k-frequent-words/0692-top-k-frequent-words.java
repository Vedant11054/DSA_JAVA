class Solution {
    public List<String> topKFrequent(String[] words, int k) 
    {
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        class pair
        {
            int first;
            String second;
            pair(int f,String s)
            {
                first=f;
                second=s;
            }
        }
        PriorityQueue<pair>heap=new PriorityQueue<>(
            (a,b)->
            {
                if(a.first!=b.first)
                {
                    return a.first-b.first;
                }
                return b.second.compareTo(a.second);
            }
        );
        for(String key:map.keySet())
        {
            pair curr=new pair(map.get(key),key);
            if(heap.size()<k)
            {
                heap.add(curr);
            }
            else if (curr.first > heap.peek().first || (curr.first == heap.peek().first && curr.second.compareTo(heap.peek().second) < 0))
            {
                heap.poll();
                heap.add(curr);
            }
        }
        List<String>ans=new ArrayList<>();
        while(heap.size()>0)
        {
            ans.add(heap.poll().second);
        }
        Collections.reverse(ans);
        return ans;

    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) 
    {
        int n=profits.length;
        class pair
        {
            int capital;
            int profit;
            pair(int c,int p)
            {
                capital=c;
                profit=p;
            }
        }       
        pair[] project=new pair[n];
        for (int i = 0; i < n; i++) {
            project[i] = new pair(capital[i], profits[i]);
        }
        Arrays.sort(project, (a, b) -> a.capital - b.capital);
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        int idx=0;
        while(k>0)
        {
            k--;
            while(idx<n)
            {
                if(project[idx].capital>w)
                {
                    break;
                }
                else
                {
                    heap.add(project[idx].profit);
                    idx++;
                }
            }
            if(heap.size()==0)
            {
                return w;
            }
            w=w+heap.poll();
        }
        return w;
    }
}
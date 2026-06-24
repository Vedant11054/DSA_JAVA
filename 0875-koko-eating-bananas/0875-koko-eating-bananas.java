class Solution {
    public long fun(int[] piles,int n ,int speed)
    {
        long h=0;
        for(int i=0;i<n;i++)
        {
            h+=piles[i]/speed;
            if(piles[i]%speed!=0)
            {
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n=piles.length;
        int max=Integer.MIN_VALUE;
        int low=1;
        int ans=-1;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(max,piles[i]);
        }
        while(low<=max)
        {
            int guess =low+(max-low)/2;
            long hr=fun(piles,n,guess);
            if(hr>h)
            {
                low=guess+1;
            }
            else if(hr<=h)
            {
                ans=guess;
                max=guess-1;
            }
        }
        return ans;

    }
}
class Solution {
    public long fun(int[] piles,int n,int speed)
    {
        long h=0;
        for(int i=0;i<n;i++)
        {
            h=h+ piles[i]/speed;
            if(piles[i]%speed!=0)
            {
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) 
    {
    int  low=1;
    int high=Integer.MIN_VALUE;
    int n=piles.length;
    int ans=-1;
    for(int i=0;i<n;i++)    
    {
        high=Math.max(high,piles[i]);
    }
    while(low<=high)
    {
        int guess=low+(high-low)/2;
        long hr=fun(piles,n,guess);
        if(hr>h)
        {
            low=guess+1;
        }
        else
        {
            ans=guess;
            high=guess-1;
        }
    }
    return ans;
    }
}
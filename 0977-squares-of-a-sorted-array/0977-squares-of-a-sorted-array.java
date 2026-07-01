class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        List<Integer>pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        int[] ans=new int[nums.length];
        if(nums[0]>=0)    
        {
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=nums[i]*nums[i];
            }
            return nums;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                pos.add(nums[i]*nums[i]);
            }
            else
            {
                neg.add(nums[i]*nums[i]);
            }
        }  
        Collections.reverse(neg);
        System.out.println(pos);
        System.out.println(neg);
        int i=0;
        int j=0;
        int idx=0;
        while(i<pos.size() && j<neg.size())
        {
            if(pos.get(i)<=neg.get(j))
            {
                ans[idx]=pos.get(i);
                idx++;
                i++;
            }
            else
            {
                ans[idx]=neg.get(j);
                idx++;
                j++;
            }
        }
        while(i<pos.size())
        {
            ans[idx]=pos.get(i);
            idx++;
            i++;
        }
        while(j<neg.size())
        {
            ans[idx]=neg.get(j);
            idx++;
            j++;
        }
        
    return ans;
    }
}
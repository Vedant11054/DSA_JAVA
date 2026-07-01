class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int i=0;
        int j=numbers.length-1;
        int[] ans=new int[2];
        while(i<j)    
        {
            int curr=numbers[i]+numbers[j];
            if(curr==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(curr>target)
            {
                j--;
            }
            else if(curr<target)
            {
                i++;
            }
        }
        return ans; 
    }
}
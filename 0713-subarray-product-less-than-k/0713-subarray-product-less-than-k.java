class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int low=0,high=0,res=0,product=1;
        while(high<nums.length)   //2,5,6,10
        {
            product*=nums[high];
            while(product>=k)
            {
                product /= nums[low];
                low++;
            }
            res+=(high-low+1);
            high++;
        }
        return res;
    }
}
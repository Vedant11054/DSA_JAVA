class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ansl=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
             else if(nums[mid]>=target)
            {
                ansl=mid;
                high=mid-1;
            }
        }
         if (ansl == -1 || nums[ansl] != target) {
            return new int[]{-1, -1};
        }
        int ansh=-1;
        low=0;
        high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<=target)
            {
                ansh=mid;
                low=mid+1;
            }
             else if(nums[mid]>target)
            {
                high=mid-1;
            }
        }
        return new int[]{ansl,ansh};
    }
}
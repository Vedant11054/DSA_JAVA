class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int high=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[high]<arr[i])
            {
                high=i;
            }
        }
        return high;
    }
}
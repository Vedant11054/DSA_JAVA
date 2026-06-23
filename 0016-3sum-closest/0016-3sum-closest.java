class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int maxdiff=9999;
        int anssum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length-2; i++) {
            int j=i+1,k=arr.length-1;
            
            while (j<k) 
                {
                int sum=arr[i]+arr[j]+arr[k];
                int diff=Math.abs(target - sum);
                if (diff<maxdiff) {
                    maxdiff=diff;
                    anssum=sum;                    
                }
                if (sum==target) {
                     anssum=sum;   
                     j++;                 
                }    
                 if (sum<target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return anssum;
    }
}
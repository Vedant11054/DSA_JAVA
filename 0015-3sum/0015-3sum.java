class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-2; i++) 
        {
            int j=i+1,k=arr.length-1,target=-1*arr[i];
            if (i>0 && arr[i]==arr[i-1]) {
                continue;
            }
            while (j<k) 
            {
                if (arr[j]+arr[k]==target) 
                {
                    // ans.add(Arrays.asList(arr[i]+arr[j]+arr[k]));
                    ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                   while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }    
                else if (arr[j]+arr[k]>target) 
                {
                        k--;
                }
                else if (arr[j]+arr[k]<target) 
                {
                    j++;    
                }
            }
        }
        return ans;
        
    }
}
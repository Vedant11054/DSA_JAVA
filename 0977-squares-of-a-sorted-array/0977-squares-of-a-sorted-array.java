class Solution {
    public int[] sortedSquares(int[] nums) {
       ArrayList <Integer> negarr=new ArrayList<>();
        ArrayList <Integer> posarr=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                negarr.add(nums[i]);
            }
            else if(nums[i]>=0)
            {
                posarr.add(nums[i]);
            }
        }
        System.out.println(negarr);
        System.out.println(posarr);
        for(int i=0;i<negarr.size();i++)
        {
            int ans=negarr.get(i);
            negarr.set(i,ans*ans);
        }
         for(int i=0;i<posarr.size();i++)
        {
            int ans=posarr.get(i);
            posarr.set(i,ans*ans);
        }
            System.out.println(negarr);
            System.out.println(posarr);
            int i=negarr.size()-1,j=0,idx=0;
            while (i>=0 && j<=posarr.size()-1 ) 
            {
                int elementi=negarr.get(i);
                int elementj=posarr.get(j);
                if (elementi<elementj) {
                nums[idx]=elementi;
                i--;      
                idx++;       
                }    
                else if (elementi>=elementj) {
                    nums[idx]=elementj;
                    j++;
                    idx++;
                }
            }
            while (i>=0) {
                int elementi=negarr.get(i);
                nums[idx]=elementi;
                i--;      
                idx++;
            }
            while (j<=posarr.size()-1 ) {
                int elementj=posarr.get(j);
                nums[idx]=elementj;
                    j++;
                    idx++;
            }
        return nums;
    }
}
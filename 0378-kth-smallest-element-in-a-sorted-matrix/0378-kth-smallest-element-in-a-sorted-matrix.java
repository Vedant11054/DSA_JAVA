class Solution {
    public int fun(int[][] matrix,int guess, int m, int n)
    {
        int row=m;
        int col=0;
        int count=0;
        while(row>=0 && col<=n)
        {
            if(matrix[row][col]<=guess)
            {
                count=count+row+1;
                col++;
            }
            else if(matrix[row][col]>guess)
            {
                row--;
            }
           
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length-1;
        int n=matrix[0].length-1;
        int low=matrix[0][0];
        int high=matrix[m][n];
        int ans=-1;
        while(low<=high)
        {
            int guess=(low+high)/2;
            if(fun(matrix,guess,m,n)<k)
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
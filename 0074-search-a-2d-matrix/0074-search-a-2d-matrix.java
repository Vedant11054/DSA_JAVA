class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int res=-1;
    int low=0;
    int high=matrix.length-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(matrix[mid][0]<=target)
        {
            res=mid;
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    if(res==-1)
    {
        return false;   
    }
    low=0;
    high=matrix[0].length-1;
    while(low<=high)
    {
        int mid=(low+high)/2;
        if(matrix[res][mid]==target)
        {
            return true;
        }
        else if(matrix[res][mid]>target)
        {
            high=mid-1;
        }
        else if(matrix[res][mid]<target)
        {
            low=mid+1;
        }
    }
    return false;
}
}
class Solution {
    
    public boolean search(int[][] matrix,int target,int rows)
    {
        int n=matrix[0].length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(matrix[rows][mid]==target)
            {
                return true;
            }
            else if(matrix[rows][mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int start=0;
        int end=m-1;
        while(start<=end)
        {
            int midrow=start+(end-start)/2;
            if(target>=matrix[midrow][0] && target<=matrix[midrow][n-1])
            {
                return search(matrix,target,midrow);
            }
            else if(target>=matrix[midrow][n-1])
            {
                start=midrow+1;
            }
            else if(target<=matrix[midrow][n-1])
            {
                end=midrow-1;
            }
        }
        return false;
    }
}

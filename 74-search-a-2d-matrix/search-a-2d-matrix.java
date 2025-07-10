class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int l=0;
        int r=row*col-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int midval=matrix[mid / col][mid % col];
            if(midval==target){
                return true;
            }
            else if(midval<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}
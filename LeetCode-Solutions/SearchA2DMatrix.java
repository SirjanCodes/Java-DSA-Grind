class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length; //number of rows
        int n=matrix[0].length; //number of columns
        //BS to find mid then BS to find target in that column
        int low=0;
        int high=(m*n)-1; //size of array (imagine as 1D coz its strictly sorted)
        while(low<=high){
            int mid=low+(high-low)/2;
            //mapping 1D to 2D:-
            int midValue=matrix[mid/n][mid%n]; /*here,mid/n=number of rows surpassed, mid%n=column where the target is present, in short the direct row and column where the target element is present*/
            if(midValue==target){
                return true;
            }
            if(midValue<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}

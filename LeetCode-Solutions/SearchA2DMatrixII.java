class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int c=matrix[0].length-1; /*VIMP:-0 is used to start from the 1st row otherwise it will be 1-1=0, we r starting from the top-right corner ,so, left is smaller and down is bigger numbers*/
        while(r<matrix.length && c>=0){ /*logic:-we r just traversing through each row and checking each element using column and seeing if target is present or not, simple, nothing else*/
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]<target){
                r++;
            }
            else{ //gotta remember else, otherwise index out of bounds
                c--;
            }
        }
        return false;
    }
}

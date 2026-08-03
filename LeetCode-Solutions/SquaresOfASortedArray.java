class Solution {
    public int[] sortedSquares(int[] nums) {
        int square[]=new int[nums.length];
        //square array
        for(int i=0;i<nums.length;i++){
            square[i]=nums[i]*nums[i];
        }
        //then sort the square array accordingly
        for(int i=0;i<square.length;i++){
            for(int j=1;j<square.length-i;j++){
                if(square[j-1]>square[j]){
                    int temp=square[j-1];
                    square[j-1]=square[j];
                    square[j]=temp;
                }
            }
        }
        return square;
    }
}

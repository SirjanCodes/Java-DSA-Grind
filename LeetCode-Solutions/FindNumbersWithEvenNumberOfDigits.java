class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){ //loop coz its an array,so no silly mistake plz
            int currnum=nums[i];
            int digits=0;
            while(currnum>0){ //basic digits logic
            digits++;
            currnum=currnum/10;
            }
            if(digits%2==0){
                count++;
            }
        }
            return count;
}
}

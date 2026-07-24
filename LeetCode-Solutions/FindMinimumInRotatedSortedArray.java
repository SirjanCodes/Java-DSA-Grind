class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min=nums[0];
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                min=nums[mid+1]; //simple logic:-element next to pivot is the minimum
                return min;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                min=nums[mid];
                return min;
            }
            if(nums[start]>nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return min;
    }
}

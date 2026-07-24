class Solution {
    //same logic:-just number after pivot
    public int findMin(int[] nums){
        int start=0;
        int end=nums.length-1;
        int min=nums[0];
        while(start<end){
            int mid=start+(end-start)/2;
            //to find pivot
            if(mid<end && nums[mid]>nums[mid+1]){
                min=nums[mid+1];
                return min;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                min=nums[mid];
                return min;
            }
            //checking for duplicates
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                if(start<end && nums[start]>nums[start+1]){
                    min=nums[start+1];
                    return min;
                }
                start++; //moving on if not the pivot
                if(start<end && nums[end-1]>nums[end]){
                    min=nums[end];
                    return min;
                }
                end--; //moving on if not the pivot
            }
            //squeezing pointers
            else if(nums[mid]>nums[start] || (nums[mid]==nums[start] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return min;
    }
}

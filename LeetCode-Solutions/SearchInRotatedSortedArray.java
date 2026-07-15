class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=-1; //initially taking as not found
        //STEP 1:-finding the pivot element
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                pivot=mid;
                break; //pivot found
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                pivot=mid-1;
                break; //pivot found
            }
            if(nums[start]>nums[mid]){ //just setting the pointers to find the pivot element
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //STEP 2:-finding the target using the pivot element
        if(pivot==-1){ //pivot not found so array isnt rotated
            start=0;
            end=nums.length-1;
        }
        else if(nums[pivot]==target){
            return pivot;
        }
        else if(nums[0]>target){
            start=pivot+1;
            end=nums.length-1;
        }
        else{
            start=0;
            end=pivot-1;
        }
        //STEP 3:-basic BS while loop to search the target element
        while(start<=end){
             int mid=start+(end-start)/2;
             if(nums[mid]==target){
                return mid;
             }
             if(nums[mid]<target){
                start=mid+1;
             }
             if(nums[mid]>target){
                end=mid-1;
             }
        }
        return -1;
    }
}

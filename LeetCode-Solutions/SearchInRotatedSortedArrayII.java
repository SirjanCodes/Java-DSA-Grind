class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int pivot=-1;
        //STEP 1:-searching for the pivot element 
        /*logic in this type:-we remove the duplicates from start and end if they r equal to 
        mid and also check if the elements at start or end might be the pivot element,
        and then squeeze the pointers accordingly, rest step 2 & 3 are same*/
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                pivot=mid; //using all this due to boolean return type
                break;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                pivot=mid-1;
                break;
            }
            //logic:-
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                if(end>start && nums[start]>nums[start+1]){ //checking if start is pivot
                    pivot=start;
                    break;
                }
                start++; //skipping the duplicate
                if(start<end && nums[end]<nums[end-1]){ //checking if end is pivot
                    pivot=end-1;
                    break;
                }
                end--; //skipping the duplicate
            }
            //squeezing the pointers
           else if(nums[mid]>nums[start] || (nums[mid]==nums[start] && nums[mid]>nums[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        //STEP 2:-finding target using the pivot element
        if(pivot==-1){
            start=0;
            end=nums.length-1;
        }
        else if(nums[pivot]==target){
            return true;
        }
        else if(nums[0]>target){ //no silly mistakes, we'll use pivot, not mid
            start=pivot+1;
            end=nums.length-1;
        }
        else{
            start=0;
            end=pivot-1;
        }
        //STEP 3:-basic BS loop to find the target
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
        }
        return false;
    }
}

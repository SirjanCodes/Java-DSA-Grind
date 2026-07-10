class Solution {
    public int[] searchRange(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;
      int ans[]={-1,-1}; //iski default value yahi rkhdi agrr nhi found hota h
      //for the 1st starting index
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            ans[0]=mid; //1st ki value ans mai daaldi
            end=mid-1; //1st milne ke baad left mai bhejdia kyuki udhr repeat nhi hora
        }
        if(nums[mid]<target){
            start=mid+1;
        }
        if(nums[mid]>target){
            end=mid-1;
        }
      }
       //for the 2nd ending index
       start=0; //resetting start pointer
       end=nums.length-1; //resetting end pointer
       //no silly mistake :- these pointers must be reset to find correct 2nd index
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            ans[1]=mid; //2nd ki value ans mai daaldi
            start=mid+1; //milne ke baad right mai bhejdia kyuki udhr repeat nhi hora
        }
        if(nums[mid]<target){
            start=mid+1;
        }
        if(nums[mid]>target){
            end=mid-1;
        }
      }
      return ans;
    }
}

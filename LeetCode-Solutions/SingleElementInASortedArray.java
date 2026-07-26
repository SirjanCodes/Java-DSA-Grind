class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){ //if array has only one element
            return nums[0];
        }
        if(nums[0]!=nums[1]){ //if the first element is the single element
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){ /*if the last element is the single element*/
            return nums[nums.length-1];
        }
        int start=1; //1 coz we already checked for 0 (first element)
        int end=nums.length-2; //-1 coz we already checked for -1 (last element)
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){ //basic logic
                return nums[mid];
            }
            //specific pattern logic:-main logic is this only:-(Even,Odd) Pair:-
            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])){
                start=mid+1; //pattern not broken so forward at right
            }
            else{ //(Odd,Even) Pair
                end=mid-1; //pattern broken so backward at left 
            }
        }
        return -1;
    }
}

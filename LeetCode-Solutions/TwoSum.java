class Solution {
    public int[] twoSum(int[] nums, int target) {
          for(int i=0;i<nums.length;i++){
            //j=i+1, is a pointer which acts as a second number
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j}; //remember syntax            
                    }
            }
        }
        return new int[]{};
    }
}

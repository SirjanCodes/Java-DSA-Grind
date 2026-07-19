class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length]; //copying same array to avoid other copies of elements
        for(int i=0;i<nums.length;i++){
              int count=0; //no silly mistakes
              for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
        }
        ans[i]=count; //storing values in the newly made array
        }
        return ans;
    }
}

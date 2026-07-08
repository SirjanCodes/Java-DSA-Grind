class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++){ /*we used n coz original array will not contain 2*n index elements*/
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}

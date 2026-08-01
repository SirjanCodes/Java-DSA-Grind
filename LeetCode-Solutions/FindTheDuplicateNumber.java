class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){ //if not equal then basic sorting like always
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{ //otherwise return the duplicate number
               return nums[i];
            }
        }
        else{ //otherwise move forwrd 
            i++;
        }
        }
        return -1; //no duplicates found
    }
}

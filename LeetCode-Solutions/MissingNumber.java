class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        //just sorting the array according to the logic given
        while(i<nums.length){
            int correct=nums[i]; //coz index=value itself in range 0 to n
            if(nums[i]<nums.length && nums[i]!=nums[correct]){ /*no silly mistake:-done forget the first condition as the numbers in the array will also move just like the index so less than arr.length*/
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        //case 1:-now putting the logic after sorting
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        /*case 2:-returning the length if everything else is fine(sorted) as thats the only thing that can be missing otherwise*/
        return nums.length;
    }
}

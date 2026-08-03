class Solution {
    public void sortColors(int[] nums) {
        //bubble sort=stable sorting algo so order is balanced, insertion sort can also be used
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(nums)); //void return type
    }
}

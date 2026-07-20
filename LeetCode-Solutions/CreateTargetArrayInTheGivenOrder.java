class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            /*shifting loop:-right to left so that we got extra space on the right to shift the element already present on the particular index we want to insert the element*/
            for(int j=target.length-1;j>index[i];j--){ /*index[i] coz shifting will happen due to this only(insertion of element at a particular position occupied generally)*/
                target[j]=target[j-1]; //logic of the shifting loop
            }
            //inserting the values in the target array
            target[index[i]]=nums[i];
        }
        return target;
    }
}

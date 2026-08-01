class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>(8);
        int i=0;
        //just sorting first
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        //now applying the logic:-index+1
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){ //basic logic
                list.add(index+1);
            }
        }
        return list;
    }
}

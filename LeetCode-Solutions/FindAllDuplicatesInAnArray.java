class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list=new ArrayList<>(69);
        int i=0;
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
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){ /*same logic as 1 to n missing numbers coz here we r finidng the numbers who r sitting at the wrong place*/
                list.add(nums[index]);
            }
        }
        return list;
    }
}

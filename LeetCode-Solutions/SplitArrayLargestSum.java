class Solution {
    public int splitArray(int[] nums, int k) {
         int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            //no silly mistakes man
            start=Math.max(start,nums[i]); //case 1:-max no. of partitions i.e. size of array
            end=end+nums[i]; //case 2:-min. no. of partitions i.e. 1:-whole array
        }
        //applying BS on both the cases
        while(start<end){
            int pieces=1; //atleast 1 piece will be there:-whole array
           int sum=0;
            int mid=start+(end-start)/2;
            for(int i=0;i<nums.length;i++){ //no silly mistakes
            if((sum+nums[i])<=mid){         //    ""
                sum=sum+nums[i]; //number of elements add hote rhenge
            }
            else{
                sum=nums[i];
                pieces++; //then, count krlenge ki kitne pieces huye hai less than mid
            }
            }
            //checks for range adjustments
            if(pieces>k){ //guess is too small,we gotta go ahead
                start=mid+1;
            }
            else{
                end=mid; //guess is good but more work to do to search
            }
        }
        return end; //or start, both are equal now
    }
}

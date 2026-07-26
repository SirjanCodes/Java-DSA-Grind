class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num%mid==0 && mid==num/mid){ /*same sqrtx logic:-'%'' will be added coz this time we need the exact square root instead in points*/
                return true;
            }
            if(mid<num/mid){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}

class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x;
        int ans=0; //to store the value of mid
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid==x/mid){ //simple easy logic:-x/mid
                return mid;
            }
            if(mid<x/mid){
                ans=mid; //value stored
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}

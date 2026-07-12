class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){ //no target,so using mid only
                start=mid+1; //logic
            }
            else{
                end=mid; //logic
            }
        }
        return start; /*at last,both end nd start will point at same index so we can return any one*/
    }
}

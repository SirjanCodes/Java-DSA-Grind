/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //in mountain array questions, it is compulsory to use peak element then only solve using the peak element
        int n = mountainArr.length(); //due to limited use of .get() calls
        int start = 0;
        int end = n - 1;
        while(start < end){ /* "<" is used when we when you are looking for a boundary, a peak, or a transition point*/
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        int peak = start; //here, peak element is found
        //now finding the element on left side of peak:-ascending order
        start = 0;
        end = peak;
        while(start <= end){ // "<=" is used when we are searching for a specific target value
            int mid = start + (end - start) / 2;
             //for using .get() calls in limited way
            int midVal = mountainArr.get(mid);
            if(midVal == target){
                return mid;
            }
            else if(midVal < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        //now, searching on the right of the peak:-descending order
        start = peak + 1;
        end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            //for using .get() calls in limited way
            int midVal = mountainArr.get(mid);
            if(midVal == target){
                return mid;
            }
            else if(midVal > target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

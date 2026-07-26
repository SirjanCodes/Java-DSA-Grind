/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){ //using the method
                end=mid; /*version is bad then end is mid due to return the bad version not further other ones present*/
            }
            else{
                start=mid+1;
            }
        }
        return end; //or start, both are equal now
    }
}

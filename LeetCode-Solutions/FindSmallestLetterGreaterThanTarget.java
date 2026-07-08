class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1; //no silly mistake:-letters is the char array name
        //by default, ascending is understood
            //safety checks
            if(target>=letters[end]){
                return letters[0];
            }
            //dont get confused with String and this
            while(start<=end){
                int mid=start+(end-start)/2;
                if(letters[mid]<=target){
                    start=mid+1;
                }
                if(letters[mid]>target){
                    end=mid-1;
                }
            }
            return letters[start];
    }
}

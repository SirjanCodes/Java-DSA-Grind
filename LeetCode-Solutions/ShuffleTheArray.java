class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n]; //given length of array
        int count=0; //pointer for tracking placement of the elements
        for(int i=0;i<n;i++){
            arr[count]=nums[i]; //element x
            count++; //move the pointer
            //similarly,element y is dropped:-
            arr[count]=nums[i+n]; //dont be confused, here n is the initial (half) value
            count++; //move the pointer
        }
        return arr;
    }
}

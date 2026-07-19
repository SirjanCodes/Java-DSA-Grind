class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //remember below syntax for boolean array list:-no silly mistake man
        ArrayList<Boolean> result=new ArrayList<>(7); //to store the value for the return type
        int max=candies[0];
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int curnum=candies[i];
            curnum=curnum+extraCandies;
             if(curnum>=max){
                result.add(true); //remember syntax:-no silly mistakes
            }
            else{
                result.add(false);
            }
                }
                return result;
                    }
}

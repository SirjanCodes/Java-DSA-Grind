class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int i=0;i<accounts.length;i++){
          int sum=0;//in this position as the sum will be reset for next customer// 
                    for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
             if(max<sum){
                    max=sum;
                }
        }
        return max;
    }
}

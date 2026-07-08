class Solution {
    public int reverse(int x) {
        int x1 = x;
        long ans = 0L;
        while (x1 > 0 || x1 < 0) { //for including all the numbers
            int rem = x1 % 10;
            x1 = x1 / 10;
            ans = ans * 10 + rem;
        }
        
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) { //for the condition given in the question not exceeding int limit
            return 0;
        }
        
        return (int) ans;
    }
}

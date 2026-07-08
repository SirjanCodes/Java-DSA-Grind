class Solution {
    public boolean isPalindrome(int x) {
        long ans = 0L;
        int x1 = x;
        while (x1 > 0) {
            int rem = x1 % 10;
            x1 = x1 / 10;
            ans = ans * 10 + rem;
        }
        if (ans == x) {
            return true;
        } else {
            return false;
        }
    }
}

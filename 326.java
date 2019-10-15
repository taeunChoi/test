class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int rest = 0;
        while(n > 1) {
            rest = n % 3;
            n /= 3;
            if(rest != 0) return false;
        }
        
        return rest == 0;
    }
}

class Solution {
    public int mySqrt(int x) {
        // Base case: if x is 0 or 1, its square root is itself
        if (x == 0 || x == 1) {
            return x;
        }
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Use division (mid <= x / mid) instead of multiplication (mid * mid <= x)
            // to entirely prevent integer overflow issues
            if (mid <= x / mid) {
                ans = mid;      // Record mid as a potential answer
                start = mid + 1; // Search the right half for a larger integer
            } else {
                end = mid - 1;   // Search the left half
            }
        }
        
        return ans;
    }
}

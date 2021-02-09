// https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
class ClimbingStairs {
    public Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (cache.containsKey(n)) // memorization of previous calculations
            return cache.get(n);
        
        int result = climbStairs(n-1) + climbStairs(n-2);
        cache.put(n, result);
        
        return result;
    }
}
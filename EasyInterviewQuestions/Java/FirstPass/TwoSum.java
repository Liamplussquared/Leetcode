// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
// Using HashMap to search for target value, O(n) complexity 
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int res[] = new int[2];
        Map<Integer, Integer> targets = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < len; i++) {
            if (targets.containsKey(target - nums[i])) {
                res[1] = i;
                res[0] = targets.get(target-nums[i]);
                return res;
            }
            targets.put(nums[i], i);
        }
        
        return res;
    }
}
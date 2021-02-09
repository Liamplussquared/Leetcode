// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
// using ArrayList makes this somewhat memory intensive
class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        ArrayList<Integer> rotated = new ArrayList<Integer>();
        
        for(int i = len - k; i < len; i++) {
            rotated.add(nums[i]);
        }
        
        for(int i = 0; i < len-k; i++) {
            rotated.add(nums[i]);
        }
        
        for (int i = 0; i < len; i++) {
            nums[i] = rotated.get(i);
        }      
    }
}
// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
class SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length <= 2)
            return nums[0];
        
        if(nums[0] != nums[1]) 
            return nums[0];
          
        for (int i = 1; i < nums.length-1; i++) {
            System.out.println(nums[i-1] + " "+ nums[i] + " " + nums[i+1]);
            if (!(nums[i-1]==nums[i] || nums[i+1]==nums[i]))
               return nums[i];
        }
        
        return nums[nums.length-1];
    }
}
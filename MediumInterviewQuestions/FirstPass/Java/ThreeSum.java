//https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // create Set to contain solutions
        Set<List<Integer>> sols = new HashSet<List<Integer>>();
        
        // need at least three numbers for a solution
        if (nums.length == 0) 
            return new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++) {
            int j = i + 1;
            int k = nums.length-1;
            
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    sols.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    // update pointers
                    j++;
                    k--;
                }
                else if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
            }
        }
        
        // create ArrayList from HashSet of solutions
        return new ArrayList<>(sols);
    }
}
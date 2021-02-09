//https://leetcode.com/explore/interview/card/top-interview-questions-easy/98/design/670/
class ShuffleArray {
    private int nums[];
    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Random r = new Random();
        int randomShuffle[] = nums.clone();
        
        for(int i = 0; i < nums.length; i++) {
            int randomIndex = r.nextInt(nums.length);
            // swap elements
            int temp = randomShuffle[i];
            randomShuffle[i] = randomShuffle[randomIndex];
            randomShuffle[randomIndex] = temp;
        }
        
        return randomShuffle;
    }
}


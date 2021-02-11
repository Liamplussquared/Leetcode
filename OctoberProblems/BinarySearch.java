// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3488/
class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        
        while (low <= high) {
            mid = low + (high-low)/2;
            if (nums[mid] > target) {
                high = mid-1;
            }
            else if (nums[mid] < target) {
                low = mid+1;
            }
            else return mid;
        }
        
        return -1;
    }
}
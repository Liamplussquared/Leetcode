// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
// O(n) solution
class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int numZero = 0, len = arr.length;
        // O(n) time
        for(int n : arr) {
            if (n == 0)
                numZero++;
        }
        
        // populate array with duplicated 0s
        int zeroArr[] = new int[len+numZero];
        int j = 0;
        for(int i = 0; i < len; i++) {
            if(arr[i] == 0) {
                zeroArr[j] = 0;
                zeroArr[j+1] = 0;
                j+=2;
            }
            else {
                zeroArr[j] = arr[i];
                j++;
            }
        }
        
        // return subarray of duplicated 0s array
        for(int i = 0; i < len; i++) {
            arr[i] = zeroArr[i];
        }
    }
}
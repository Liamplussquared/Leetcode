// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3500/
class MinimumDominoRotations {
    public int minDominoRotations(int[] A, int[] B) {
        int[] aOcc = new int[7], bOcc = new int[7], sameOcc = new int[7];
        int len = A.length;
        
        for(int i = 0; i < len; i++) {
            int a = A[i], b = B[i];
            aOcc[a] += 1;
            bOcc[b] += 1;
            if (a==b) 
                sameOcc[a] += 1;
        }
        
        int ans = len;
        int swap = ans;
        for (int i = 1; i <= 6; i++) {
            if (aOcc[i] + bOcc[i] - sameOcc[i] == len) {
                swap = Math.min(aOcc[i], bOcc[i]) - sameOcc[i];
                ans = Math.min(ans, swap);
            }
        }
        
        if (ans == len)
            return -1;
        else
            return ans;
    }
}
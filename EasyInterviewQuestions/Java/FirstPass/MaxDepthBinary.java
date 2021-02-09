// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/
class MaxDepthBinary {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
    }
}
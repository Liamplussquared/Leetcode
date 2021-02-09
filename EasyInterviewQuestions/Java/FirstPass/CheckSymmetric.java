// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/
class CheckSymmetric {
    public boolean isSymmetric(TreeNode root) {
        
        if (root == null)
            return true;
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;
        
        if (node1 != null && node2 != null 
                && node1.val == node2.val) {
            return isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
        }
        
        return false;
    }
}
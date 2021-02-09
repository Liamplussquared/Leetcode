// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/
class validBST {
    public boolean isValidBST(TreeNode root) {
        
        if (validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE))
            return true;
        else
            return false;
    }
    
    public boolean validateBST(TreeNode root, long smallest, long largest) {
        
        if (root == null)
            return true;
        if (root.val <= smallest || root.val >= largest)
            return false;
        
        return validateBST(root.left, smallest, root.val) && validateBST(root.right, root.val, largest);
    }
}
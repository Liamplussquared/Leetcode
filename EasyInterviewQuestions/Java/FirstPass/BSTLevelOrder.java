// https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/
class BSTLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> outerList = new LinkedList<>();
        
        if (root == null)
            return outerList;
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
            List<Integer> innerList = new LinkedList<Integer>();
            int qSize = queue.size();
            
            for (int i = 0; i < qSize; i++) {
                TreeNode current = queue.poll();
                innerList.add(current.val);
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
            
            outerList.add(innerList);
        }
        return outerList;
    }
}
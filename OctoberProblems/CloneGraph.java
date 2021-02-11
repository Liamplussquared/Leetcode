// https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3501/
// DFS solution
class CloneGraph {
    public HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    public Node cloneGraph(Node node) {
        return helper(node);
    }
    
    public Node helper(Node node) {
        if (node==null) 
            return null;
        if (map.containsKey(node.val)) 
            return map.get(node.val);
        
        Node newNode = new Node(node.val);
        map.put(newNode.val, newNode);
        
        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(helper(neighbor));
        }
        
        return newNode;
    }
}
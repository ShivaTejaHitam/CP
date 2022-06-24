class Pair {
    TreeNode node;
    int depth;
    Pair(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}

class Solution {
    
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        Pair pair = findLCA(root,0);
        return pair.node;
    }
    
    static Pair findLCA(TreeNode root, int depth){
        
        if(root==null) return new Pair(null,depth);
        
        Pair left = findLCA(root.left,depth+1);
        Pair right = findLCA(root.right,depth+1);
        
        if(left.depth == right.depth)
            return new Pair(root,left.depth);
        
        return left.depth > right.depth ? left : right;
        
    }
}

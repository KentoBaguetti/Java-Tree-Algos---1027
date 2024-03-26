public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeftNode() {
        return this.left;
    }

    public TreeNode getRightNode() {
        return this.right;
    }

    public int getVal() {
        return this.val;
    }

    public String toString() {
        return "Node Value: " + this.getVal();
    }

}

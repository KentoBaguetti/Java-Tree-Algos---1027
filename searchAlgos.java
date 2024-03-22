import java.util.ArrayList;
import java.util.Stack;

public class searchAlgos {
    
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(13);
        root.right.right.left = new TreeNode(14);
        root.right.right.right = new TreeNode(15);

        System.out.println(maxDepthOfTree(root));

    }

    public static void simpleDFS(TreeNode node) {

        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (node == null) System.out.println("The tree is empty");

        stack.push(node);

        while (!stack.isEmpty()) {

            TreeNode curr = stack.pop();

            if (curr.getRightNode() != null) stack.push(curr.getRightNode());
            if (curr.getLeftNode() != null) stack.push(curr.getLeftNode());
            

            System.out.println(curr.getVal());

        }

    }

    public static void simpleBFS(TreeNode node) {

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();

        if (node == null) System.out.println("The tree is empty");

        queue.add(node);

        while (!queue.isEmpty()) {

            TreeNode curr = queue.remove(0);

            if (curr.getLeftNode() != null) queue.add(curr.getLeftNode());
            if (curr.getRightNode() != null) queue.add(curr.getRightNode());

            System.out.println(curr.getVal());

        }

    }

    public static void recursiveDFS(TreeNode node) {

        if (node != null) {
            System.out.println(node.getVal());

            recursiveDFS(node.getLeftNode());
            recursiveDFS(node.getRightNode());
        }

    }

    // "Visits" each sub-tree in the tree. Goes down to visit the leaf nodes then the root nodes.
    public static void inOrder(TreeNode node) {

        if (node != null) {
            inOrder(node.getLeftNode());
            System.out.println(node.getVal());
            inOrder(node.getRightNode());
        }

    }
    
    // post order is Depth first search. Going down the left side of the tree then right
    public static void postOrder(TreeNode node) {

        if (node != null) {
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.println(node.getVal());
        }

    }

    // find the number of nodes in a tree. Using pre order traversal
    public static int getNumberOfNodes(TreeNode node) {
        if (node != null) return 1 + getNumberOfNodes(node.getLeftNode()) + getNumberOfNodes(node.getRightNode());
        else return 0;
    }

    // find the maximum depth of a tree
    public static int maxDepthOfTree(TreeNode node) {

      if (node == null) return 0;
      else {
        return 1 + Math.max(maxDepthOfTree(node.getLeftNode()), maxDepthOfTree(node.getRightNode()));
      }
    }

}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by machenfei on 2017/4/2.
 */
public class TraverseBinaryTree {
    static class TreeNode {
        TreeNode(int value) { val = value; }
        int val;
        TreeNode left;
        TreeNode right;
    }

    void traverse(TreeNode node) {

        if (node == null) return;

        if (node.left != null) {
            traverse(node.left);
        }
        System.out.println(node.val);
        if (node.right != null) {
            traverse(node.right);
        }
    }

    void depthTraverse(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(node);
        while (!stack.empty()) {
            TreeNode tmp = stack.pop();
            System.out.println(tmp.val);
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
        }
    }

    void widthTraverse(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            System.out.println(tmp.val);
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);

        TraverseBinaryTree t = new TraverseBinaryTree();
        t.widthTraverse(node);
    }
}

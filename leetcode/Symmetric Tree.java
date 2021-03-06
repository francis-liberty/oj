/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
        	return true;
        return visit(root.left, root.right);
    }

    public boolean visit(TreeNode leftNode, TreeNode rightNode){
    	if (leftNode == null && rightNode == null)
    		return true;
    	if (leftNode == null || rightNode == null)
    		return false;
    	if (leftNode.val != rightNode.val)
    		return false;
    	return visit(leftNode.left, rightNode.right) && visit(leftNode.right, rightNode.left);
    }
}
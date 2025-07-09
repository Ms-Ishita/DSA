/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int MaxHeight(TreeNode root){
        if(root == null)return 0;
        return Math.max(MaxHeight(root.left),MaxHeight(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int left = MaxHeight(root.left);
        int right = MaxHeight(root.right);
        if(Math.abs(left-right)>1)return false;
        return isBalanced(root.left) && isBalanced(root.right);
        
        
    }
}
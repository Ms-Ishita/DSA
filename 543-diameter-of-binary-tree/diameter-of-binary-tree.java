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
    public int Height(TreeNode root){
        if(root==null)return 0;
        return Math.max(Height(root.left), Height(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int left = Height(root.left);
        int right = Height(root.right);
        int dia = left +right;
        return Math.max(dia, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));

        
    }
}
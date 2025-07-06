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
    public boolean calSum(TreeNode root , int sum, int targetSum ){
        if(root==null)return false;
    
        sum+=root.val;
        if(root.left == null && root.right==null&&sum==targetSum)return true;
        
        return calSum(root.left,sum, targetSum)|| calSum(root.right, sum, targetSum);
         
    
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        if(root == null) return false;
        return calSum(root, 0, targetSum);
         
        
    
    }
}
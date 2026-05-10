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
    public void countGoodNodes(TreeNode root,int max, int[] count){
        if(root == null)return ;
        if(max<=root.val)count[0]+=1;
        countGoodNodes(root.left, (max>root.val)?max:root.val, count);
        countGoodNodes(root.right,(max>root.val)?max:root.val, count);

    }
    public int goodNodes(TreeNode root) {
        int[] count = new int[2];
        countGoodNodes(root, Integer.MIN_VALUE, count);
        return count[0];

        
    }
}
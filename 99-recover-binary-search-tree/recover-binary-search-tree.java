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
    // private boolean isBST(TreeNode root, long min, long max) {
    //     if(root== null)return true;
    //     if(root.val<=min || root.val>=max)return false;
    //     return  isBst(root.left, min, root.val) && isBst(root.right, root.val, max); 

    // }
    List<TreeNode> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root== null)return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
        
    }
    public void recoverTree(TreeNode root){
        TreeNode firstNode = null;
        TreeNode secNode = null;
        inorder(root);
        for(int i =0; i<list.size()-1; i++){
            if(list.get(i).val>list.get(i+1).val){
                if(firstNode==null)
                firstNode= list.get(i);
                secNode = list.get(i+1);
                

            }
        }
        int temp = firstNode.val;
        firstNode.val = secNode.val;
        secNode.val = temp;

    
        
    }
}
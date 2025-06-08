/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode()/{}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return isgoodNodes(root,Integer.MIN_VALUE);
    }
    public int isgoodNodes(TreeNode root, int max){
        //soch balak jo jo comment mei likha h         
        if(root == null)return 0;
        
        // think that this return 0 defines what
        int count=0;
        if(root.val>=max){
            
            max=root.val;
            count++;
            
        // return 1;
        }
        
        int left=isgoodNodes(root.left,max);
        int right=isgoodNodes(root.right,max);
        return count+left+right;
        // think what happens you find out that what happens when you find out it is greatest in the path 

        // think how would you handle the count as you are returning 0 when you reach null think about it 

        //what you return at end its a big question 

    }
}
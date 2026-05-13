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
    public void path(TreeNode root, List<String>list, String str){
        if(root == null)return;
        str+=root.val;
        if(root.left == null && root.right == null ){
            list.add(str);
            return;
        }
        str+="->";
        path(root.left, list, str);
        path(root.right, list, str);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        path(root, list, "");
        return list;
    }
}
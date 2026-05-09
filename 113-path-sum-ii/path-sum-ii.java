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
    public void path (TreeNode root, int targetSum, List<Integer> list1, List<List<Integer>> list2){
        if(root == null)return;
        list1.add(root.val);
        if(root.left==null && root.right==null && targetSum == root.val)list2.add(new ArrayList<>(list1));
        path(root.left, targetSum-root.val, list1, list2);
        path(root.right, targetSum-root.val, list1, list2);
        list1.remove(list1.size() - 1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list2 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        path(root, targetSum, list1, list2);
        return list2;
        
    }
}
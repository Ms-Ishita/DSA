/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode compare(ArrayList<TreeNode> l1, ArrayList<TreeNode> l2){
        int i =0;
        while(i<l1.size() && i<l2.size() && l1.get(i)==l2.get(i)){
            i++;
        }
        return (i > 0) ? l1.get(i - 1) : null;
    }
    public boolean fillList(ArrayList<TreeNode> l1, TreeNode root, TreeNode find){
        if(root == null)return false;
        l1.add(root);
        if(root == find) return true;
        if(fillList(l1,root.left, find)|| fillList(l1, root.right, find))return true;
        l1.remove(l1.size()-1);
        return false;
        

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       ArrayList<TreeNode> path1 = new ArrayList<>();
       ArrayList<TreeNode> path2 = new ArrayList<>();

       fillList(path1, root, p);
       fillList(path2, root, q);
       return compare(path1, path2);

     
     
    }
}
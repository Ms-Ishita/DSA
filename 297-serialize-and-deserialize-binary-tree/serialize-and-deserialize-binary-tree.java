/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode>  q = new LinkedList<>();
        if(root==null)return "";
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr == null){
                sb.append("N ");
                continue;
            }
            
            sb.append(curr.val).append(" ");
            q.offer(curr.left);
            q.offer(curr.right);
            

        }
        System.out.println(sb.toString()+" ");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       if(data.length()==0 || data==null)return null;
       String[] arr = data.split(" ");
       TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
       Queue<TreeNode> q = new LinkedList<>();
       q.offer(root);
       int i =1;
       while(!q.isEmpty() && i<arr.length){
        TreeNode curr = q.poll();
        if(!arr[i].equals("N")){
            curr.left = new TreeNode(Integer.parseInt(arr[i]));
            q.offer(curr.left);
        }
        i++;
        if(i<arr.length && !arr[i].equals("N")){
            curr.right = new TreeNode(Integer.parseInt(arr[i]));
            q.offer(curr.right);
        }
        i++;     
       }
       return root;

       
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
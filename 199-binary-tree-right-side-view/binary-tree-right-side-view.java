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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        List<Integer> ans= new ArrayList<>();
        int node=0;
        if(root==null) return ans;
        q.add(root);
        while(q.size()>0){
            int n=q.size();
            while(n-->0){
                TreeNode t=q.remove();
                node= t.val;
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }

            }
            ans.add(node);
        }
        return ans;
    }
}
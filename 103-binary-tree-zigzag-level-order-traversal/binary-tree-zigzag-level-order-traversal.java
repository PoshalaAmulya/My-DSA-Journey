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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        int i;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        if(root==null)
        return ans;
        int cnt=0;
        while(q.size()>0){
            int n=q.size();
            List<Integer> li= new ArrayList<>();
            while(n-->0){
                TreeNode t=q.remove();
                li.add(t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
            cnt++;
            // System.out.println(cnt);
            if(cnt%2==0){
                Collections.reverse(li);
            }

            ans.add(li);
        }
        return ans;
    }
}
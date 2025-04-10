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
    public int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int left= check(root.left);
        int right= check(root.right);
        if(left==-1 || right==-1) return -1;
        else if(Math.abs(left-right)<=1) return Math.max(left,right)+1;
        return -1;
    }
    public boolean isBalanced(TreeNode root) {
        int ans=check(root);
        if(ans==-1) return false;
        return true;
    }
}
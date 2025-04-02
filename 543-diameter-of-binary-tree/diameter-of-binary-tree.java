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
    int dia=0;
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int lf=height(root.left);
        int rt=height(root.right);
        dia=Math.max(dia,lf+rt);
        return Math.max(lf,rt)+1;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        height(root);
        return dia;
        
    }
}
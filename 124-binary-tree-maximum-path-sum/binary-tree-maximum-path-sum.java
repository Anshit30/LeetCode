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

    int maxSum = Integer.MIN_VALUE;

    public int solve(TreeNode root){
        if(root == null){
            return 0;
        }
        int op1 = Math.max(0,solve(root.left));
        int op2 = Math.max(0,solve(root.right));
        int op3 = root.val + op1 + op2;

        maxSum = Math.max(maxSum,op3);
        return root.val + Math.max(op1,op2);

    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxSum;
    }
}
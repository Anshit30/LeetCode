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
    public void preOrder(ArrayList<Integer> arr, TreeNode root){
        if(root == null){
            return;
        }
        arr.add(root.val);
        preOrder(arr,root.left);    //traverse left
        preOrder(arr,root.right);   //traverse right 
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        preOrder(arr,root);
        return arr;
    }
}
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
    List<Integer>list=new ArrayList<>();
    void fun(TreeNode tptr) {
        if (tptr==null) return;
        fun(tptr.left);
        list.add(tptr.val);
        fun(tptr.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        fun(root);
        return list;
    }
}
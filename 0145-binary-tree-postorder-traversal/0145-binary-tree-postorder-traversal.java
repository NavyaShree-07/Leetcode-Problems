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
        fun(tptr.right);
        list.add(tptr.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
         fun(root);
        return list;
    }
}

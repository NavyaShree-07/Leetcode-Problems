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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        	TreeNode tptr;
	tptr=root;
	if(root==null){
		root=new TreeNode(val);
		return root;
 	}
	while(true){
		if(val<tptr.val){
		   if(tptr.left!=null)
			tptr=tptr.left;
            else{
  			tptr.left=new TreeNode(val);
			break;
		   }
		}
		else{
		   if(tptr.right!=null)
			tptr=tptr.right;
            else{
  			tptr.right=new TreeNode(val);
			break;
		   }
		}
    }
    return root;
    }
}
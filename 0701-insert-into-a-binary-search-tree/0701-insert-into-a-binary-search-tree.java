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
        //TreeNode newroot=val;
      if(root==null){
        return new TreeNode(val);
     }
     //compare krna h isme agar null nahi hai
     if(val>root.val){
        root.right=insertIntoBST(root.right,val);
     }
     else if(val<root.val){
        root.left=insertIntoBST(root.left,val);

    }
    return root;



      


    }
}
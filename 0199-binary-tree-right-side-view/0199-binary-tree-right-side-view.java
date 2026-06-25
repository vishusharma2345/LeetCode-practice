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
 //BY DEPTH FIRST SEARCH RECURSION
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>lis=new ArrayList<>();
        fun(root,lis,0);
        return lis;
    }
    void fun(TreeNode root,List<Integer>lis,int level){
        if(root==null){
            return ;
        }
        if(level==lis.size()){
            lis.add(root.val);
        }
        fun(root.right,lis,level+1);
        fun(root.left,lis,level+1);

    }
}
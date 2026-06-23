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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //2d list to return ans;
        ArrayList<List<Integer>> ans=new ArrayList<>();
        //dfs hai iseliye queue
        Queue <TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            //to know ki kis level par kitne noides hai
            int size=q.size();
            List<Integer> l=new ArrayList<>();
            while(size-->0){
            //value nikalne k liye queue ke front mein se mein se
                TreeNode front=q.poll();
                //1 d list mein value add krna h
                l.add(front.val);
                if(front.left!=null)q.add(front.left);
                if(front.right!=null)q.add(front.right);
                }
                ans.add(l);

        }
        return ans;
 }
}
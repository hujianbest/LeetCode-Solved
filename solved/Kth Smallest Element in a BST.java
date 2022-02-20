/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Integer r = null;
    int idx = 0;
        
    public int kthSmallest(TreeNode root, int k) {
        travel(root,k);
        return r.intValue();
    }
    
    public void travel(TreeNode root, int k){
        if(root == null && r != null ) return;
        if(root.left != null) travel(root.left, k);
        if(++idx == k) r = root.val;
        if(root.right != null) travel(root.right, k);
    }
}
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return addmidnum(nums,0,nums.length-1);
    }
    public TreeNode addmidnum(int[] num,int from,int end){
        if(from>end) return null;
        int mid = (from+end)/2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = addmidnum(num,from,mid-1);
        node.right = addmidnum(num,mid+1,end);
        return node;
    }
}
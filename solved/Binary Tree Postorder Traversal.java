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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        printOne(root, result);

        return result;
    }

    private void printOne(TreeNode root,List<Integer> result){
        if(root != null){
            printOne(root.left, result);
            printOne(root.right, result);
            result.add(root.val);
        }
    }
}

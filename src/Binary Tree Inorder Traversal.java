/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         if(root==null)
//             return new ArrayList<>();
//         else{
//             if(inorderTraversal(root.left)!=null)
//                 res.addAll(inorderTraversal(root.left));
//             res.add(root.val);
//             if(inorderTraversal(root.right)!=null)
//                 res.addAll(inorderTraversal(root.right));
//         } 
//         return res;
//     }

// }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        printOne(root, result);

        return result;
    }

    private void printOne(TreeNode root,List<Integer> result){
        if(root != null){
            printOne(root.left, result);
            result.add(root.val);
            printOne(root.right, result);
        }
    }
}
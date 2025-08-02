import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        
        if(root1 ==null && root2 == null) return null;
        
        TreeNode resultRoot = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> subqueue1 = new LinkedList<>();
        Queue<TreeNode> subqueue2 = new LinkedList<>();
        queue.add(resultRoot);
        subqueue1.add(root1);
        subqueue2.add(root2);

        while(!queue.isEmpty()){

           TreeNode now = queue.poll();
           TreeNode sub1 = subqueue1.poll();
           TreeNode sub2 = subqueue2.poll();

           now.val = (sub1 == null ? 0 : sub1.val) + (sub2 == null ? 0 : sub2.val);

           if(sub1 == null || sub2 ==null) continue;


           if(sub1.right == null && sub1.left == null
            &&sub2.right == null && sub2.left == null
           ){
               continue;
           }
           if (sub1.right != null || sub2.right != null) {
               if (sub1.right == null){
                   sub1.right = new TreeNode(0);
               } else if (sub2.right == null){
                   sub2.right = new TreeNode(0);
               }

               now.right = new TreeNode(0);
               queue.add(now.right);
               subqueue1.add(sub1.right);
               subqueue2.add(sub2.right);
           }
           if (sub1.left != null || sub2.left != null) {
               if (sub1.left == null){
                   sub1.left = new TreeNode(0);
               } else if (sub2.left == null){
                   sub2.left = new TreeNode(0);
               }

               now.left = new TreeNode(0);
               queue.add(now.left);
               subqueue1.add(sub1.left);
               subqueue2.add(sub2.left);
           }




//           else if (sub1.right != null && sub2.right == null){
//               //sub2.right
//               sub2.right = new TreeNode(0);
//               now.right = new TreeNode(0);
//               queue.add(now.right);
//               subqueue1.add(sub1.right);
//               subqueue2.add(sub2.right);
//
//           } else if (sub1.left != null && sub2.left == null){
//               //sub2.left
//               sub2.left = new TreeNode(0);
//               now.right = new TreeNode(0);
//
//               queue.add(now.left);
//               subqueue1.add(sub1.left);
//               subqueue2.add(sub2.left);
//
//           } else if (sub1.right == null && sub2.right != null){
//               //sub1.right
//               sub1.right = new TreeNode(0);
//               now.right = new TreeNode(0);
//
//               queue.add(now.right);
//               subqueue1.add(sub1.right);
//               subqueue2.add(sub2.right);
//
//           } else if (sub1.left == null && sub2.left != null){
//               //sub1.left
//               sub1.left = new TreeNode(0);
//               now.left = new TreeNode(0);
//
//               queue.add(now.left);
//               subqueue1.add(sub1.left);
//               subqueue2.add(sub2.left);
//           }

        }





        return resultRoot;
    }
}
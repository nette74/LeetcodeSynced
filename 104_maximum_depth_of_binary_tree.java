import java.util.*;




class Solution {
    int maxdepth = 0;
    public int maxDepth(TreeNode root) {

//
//        Stack<TreeNode> stack = new Stack<>();
//
//        stack.push(root);
//
//        while(!stack.isEmpty()){
//            
//            
//            
//        }



        return search(root,0);
    }

    int search(TreeNode now, int depth){

        if(now == null) return depth;
        
        depth++;
        
        return Math.max( search(now.right,depth) , search(now.left,depth));
        



        
    }
}
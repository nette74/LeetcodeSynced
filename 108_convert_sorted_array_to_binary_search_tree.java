public class Solution {
    int[] nums_;
    public TreeNode sortedArrayToBST(int[] nums) {

        nums_=nums;
        return recursive(0,nums.length-1);
    }


    TreeNode recursive(int from, int to){

        if(from > to) return null;

        int mid = (from+to)/2;
        TreeNode midNode = new TreeNode(nums_[mid]);

        midNode.left = recursive(from, mid-1);
        midNode.right = recursive(mid+1, to);

        return midNode;
    }
}
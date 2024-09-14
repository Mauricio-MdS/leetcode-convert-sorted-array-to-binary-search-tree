class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        if (start > end) return null;

        int middleIndex = (start + end) / 2;
        TreeNode node = new TreeNode(nums[middleIndex]);
        node.left = sortedArrayToBST(nums, start, middleIndex - 1);
        node.right = sortedArrayToBST(nums, middleIndex + 1, end);

        return node;
    }
}
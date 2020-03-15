package com.leetcoode.problems;

import com.leetcoode.model.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

    // 二叉搜索树的中序遍历是一个有序数组
    // 二叉搜索树的根节点肯定是这个数组的中位数
    private TreeNode sortedArrayToBST(int l, int r, int[] nums) {
        if (l > r) {
            return null;
        }
        if (l == r) {
            return new TreeNode(nums[l]);
        }
        int mid = (l + r) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(l, mid - 1, nums);
        node.right = sortedArrayToBST(mid + 1, r, nums);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(0, nums.length - 1, nums);
    }
}

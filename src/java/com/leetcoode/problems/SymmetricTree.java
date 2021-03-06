package com.leetcoode.problems;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcoode.model.TreeNode;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        TreeNode leftNode, rightNode;
        while (!queue.isEmpty()) {
            leftNode = queue.remove();
            rightNode = queue.remove();
            if (leftNode == null && rightNode == null) {
                continue;
            }
            if (leftNode == null || rightNode == null) {
                return false;
            }
            if (leftNode.val != rightNode.val) {
                return false;
            }
            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
        }
        return true;
    }
}


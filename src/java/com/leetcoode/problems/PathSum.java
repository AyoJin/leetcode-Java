package com.leetcoode.problems;

import com.leetcoode.model.TreeNode;
import javafx.util.Pair;

import java.util.Stack;

public class PathSum {
    // 递归
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                return true;
            }
            return false;
        }
        int sumChild = sum - root.val;
        return hasPathSum(root.left, sumChild) || hasPathSum(root.right, sumChild);
    }

    // 迭代
    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Stack<Pair> stack = new Stack<>();
        Pair<TreeNode, Integer> pair = new Pair<>(root, sum - root.val);
        stack.push(pair);
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> p = stack.pop();
            TreeNode node = p.getKey();
            if (p.getValue() == 0 && node.left == null && node.right == null) {
                return true;
            }
            if (node.left != null) {
                stack.push(new Pair<>(node.left, p.getValue() - node.left.val));
            }
            if (node.right != null) {
                stack.push(new Pair<>(node.right, p.getValue() - node.right.val));
            }
        }
        return false;
    }
}

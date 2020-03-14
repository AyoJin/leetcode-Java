package com.leetcoode.problems;

import com.leetcoode.model.TreeNode;
import javafx.util.Pair;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Pair<TreeNode, Integer> pair = new Pair<>(root, 0);
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.add(pair);
        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> p = queue.poll();
            stack.push(p);
            int level = p.getValue();
            TreeNode node = p.getKey();
            if (node.left != null) {
                queue.offer(new Pair(node.left, level + 1));
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right, level + 1));
            }
        }
        int curLevel = stack.peek().getValue();
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        result.add(new ArrayList<>());
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pp = stack.pop();
            TreeNode node = pp.getKey();
            int level = pp.getValue();
            if (curLevel != level) {
                result.add(new ArrayList<>());
                result.get(i + 1).add(node.val);
            } else {
                result.get(i).add(node.val);
            }
        }
        return result;
    }
}

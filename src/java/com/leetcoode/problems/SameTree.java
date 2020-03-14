package com.leetcoode.problems;

import java.util.ArrayDeque;
import java.util.Queue;

import com.leetcoode.model.TreeNode;

public class SameTree {


    private boolean check(TreeNode p, TreeNode q) {
        if (q == null && p == null) {
            return true;
        }
        if (q != null && p == null) {
            return false;
        }
        if (q == null && p != null) {
            return false;
        }
        return p.val == q.val;
    }

    // 解法一： 递归
    public boolean isSameTree1(TreeNode p, TreeNode q) {
        if (!check(p, q)) {
            return false;
        }
        return isSameTree1(p.left, q.left) && isSameTree1(p.right, q.right);
    }

    // 解法二：层次遍历
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true; // 这句话不能丢
        if (!check(p, q)) {
            return false;
        }
        Queue<TreeNode> queueQ = new ArrayDeque<>();
        Queue<TreeNode> queueP = new ArrayDeque<>();
        queueQ.add(q);
        queueP.add(p);
        TreeNode q1, p1;
        while (queueP.size() > 0) { // 这里换成queueQ也可以
            p1 = queueP.remove();
            q1 = queueQ.remove();
            if (!check(p1, q1)) {
                return false;
            }
            if (!check(p1.left, q1.left)) {
                return false;
            }
            if (!check(p1.right, q1.right)) {
                return false;
            }
            if (p1.left != null) { // 因为Queue里不允许有null元素。这里换成q1也可以
                queueP.add(p1.left);
                queueQ.add(q1.left);
            }
            if (p1.right != null) {
                queueP.add(p1.right);
                queueQ.add(q1.right);
            }
        }
        return true;
    }
}

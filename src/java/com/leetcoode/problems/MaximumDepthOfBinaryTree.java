package com.leetcoode.problems;

import com.leetcoode.model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        int curPeerCnt = 1; // 当前层的结点数目
        int nxtPeerCnt = 0; // 下一层的结点数目
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            curPeerCnt--;
            if (node.left != null ){
                q.add(node.left);
                nxtPeerCnt++;
            }
            if (node.right != null) {
                q.add(node.right);
                nxtPeerCnt++;
            }
            if (curPeerCnt == 0) {
                maxDepth++;
                curPeerCnt = nxtPeerCnt;
                nxtPeerCnt = 0; // 下一次层的结点数归0
            }
        }
        return maxDepth;
    }
}

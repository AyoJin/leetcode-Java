package com.leetcoode.problems;

import java.util.Stack;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if (helper.isEmpty() || x <= helper.peek()) { // 等于也要入栈！
            helper.push(x);
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            // Integer比较为什么不能用 == ？
            if (data.peek().equals(helper.peek())) {
                helper.pop();
            }
            data.pop();
        }
    }

    public int top() {
        if (data.isEmpty()) {
            throw new RuntimeException("StackIsEmpty!");
        }
        return data.peek();
    }

    public int getMin() {
        if (helper.isEmpty()) {
            throw new RuntimeException("StackIsEmpty!");
        }
        return helper.peek();
    }
}

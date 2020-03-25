package com.leetcoode.problems;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int min = Integer.MIN_VALUE;;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        min = min < x ? min : x;
    }

    public void pop() {
        stack1.pop();
        if (stack1.isEmpty()) {
            return;
        }
        min = stack1.peek();
        while (!stack1.isEmpty()) {
            min = min < stack1.peek() ? min : stack1.peek();
            stack2.push(stack1.pop());
        }
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return min;
    }
}

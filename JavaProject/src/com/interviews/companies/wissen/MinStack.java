package com.interviews.companies.wissen;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        // Push val or current min on minStack
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        }
    }
    
    public int top() {
        if (!mainStack.isEmpty()) {
            return mainStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        throw new RuntimeException("Stack is empty");
    }
    
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(5);
        System.out.println("Min: " + stack.getMin()); // 3
        stack.push(2);
        stack.push(1);
        System.out.println("Min: " + stack.getMin()); // 1
        stack.pop();
        System.out.println("Min: " + stack.getMin()); // 2
        System.out.println("Top: " + stack.top());    // 2
    }
}

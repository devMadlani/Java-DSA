package Stack.Questions;

import java.util.Stack;

public class Q_1_Leetcode_232_QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Q_1_Leetcode_232_QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peek = second.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peek;
    }

    public boolean empty() {
        return first.empty();
    }

}

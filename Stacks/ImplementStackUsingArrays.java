package Stacks;

class myStack {
    private int arr[];
    private int top;
    private int capacity;

    public myStack(int n) {
        // Define Data Structures
        capacity = n;
        arr = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(top == -1) return true;
        return false;
    }

    public boolean isFull() {
        // check if the stack is full
        if(top+1 >= capacity) return true;
        return false;
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if(top >= capacity) return;
        top = top + 1;
        arr[top] = x;
    }

    public void pop() {
        // Removes an element from the top of the stack
        if(top == -1) return;
        top = top - 1;
    }

    public int peek() {
        // Returns the top element of the stack
        if(top == -1) return -1;
        return arr[top];
    }
}

public class ImplementStackUsingArrays {
    public static void main(String[] args) {
        
    }
}

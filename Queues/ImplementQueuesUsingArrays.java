package Queues;

class myQueue {

    private int[] arr;
    private int capacity;
    private int start;
    private int end;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        capacity = n;
        arr = new int[capacity];
        start = -1;
        
        end = -1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(end == -1 && start == -1) return true;
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(start == 0 && end == capacity-1) return true;
        return false;
    }

    public void enqueue(int x) {
        // Enqueue
        if(start == -1) start++;
        if(end == capacity - 1) return;
        end++;
        arr[end] = x;
    }

    public void dequeue() {
        // Dequeue
        if(start == end){
            start = -1;
            end = -1;
        }
        else start++;
    }

    public int getFront() {
        // Get front element
        if(end == -1) return -1;
        return arr[start];
    }

    public int getRear() {
        // Get last element
        if(start == -1 ) return -1;
        return arr[end];
    }
}


public class ImplementQueuesUsingArrays {
    public static void main(String[] args) {
        
    }
}

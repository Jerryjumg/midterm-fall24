package org.example;

public class MyCircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public MyCircularQueue(int k) {
            queue = new int[k];
            front = -1;
            rear = -1;
            size = k;
            count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) / size;
        queue[rear] = value;
        count++;
        return true;
       // throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) / size;
        }
        count--;
        return true;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return queue[rear];
       // throw new UnsupportedOperationException("Not implemented yet");
    }


    public boolean isEmpty() {
        return count == 0;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean isFull() {
        return count == size;
      //  throw new UnsupportedOperationException("Not implemented yet");
    }
}


public class MyArrayCQue_220521<T> {
    private int front;
    private int rear;
    private int queSize;
    private T[] queue;

    MyArrayCQue_220521() {
        front = 0;
        rear = 0;
        queSize = 5;
        queue = (T[]) new Object[queSize];
    }

    boolean isEmpty() {
        return (front == rear);
    }

    boolean isFull() {
        return (((rear + 1) % queSize) == front);
    }

    void push(T item) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            rear = (rear + 1) % queSize;
            queue[rear] = item;
        }
    }

    T pop() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        front = (front + 1) % queSize;
        return queue[front];
    }

    T peek() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        return queue[(front + 1) % queSize];
    }

    void delete() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            front = (front + 1) % queSize;
        }
    }
}

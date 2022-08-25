public class MyLinkedCQue_220510<T> {
    private class Node {
        T data;
        Node next;

        Node (T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    MyLinkedCQue_220510() {
        front = null;
        rear = null;
    }

    boolean isEmpty() {
        return (front == null);
    }

    void push(T item) {
        Node insertNode = new Node(item);

        if (isEmpty()) {
            front = insertNode;
            rear = insertNode;
        }
        else {
            rear.next = insertNode;
            rear = insertNode;
        }
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        T item = front.data;
        front = front.next;

        if (front == null) rear = null;

        return item;
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }

        return front.data;
    }

    void delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            front = front.next;
            if (front == null) rear = null;
        }
    }
}

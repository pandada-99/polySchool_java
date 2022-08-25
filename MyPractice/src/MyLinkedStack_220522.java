public class MyLinkedStack_220522<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    MyLinkedStack_220522() {
        top = null;
    }

    boolean isEmpty() {
        if(top == null) return true;
        else return false;
    }

    void push(T item) {
        Node pushNode = new Node(item);
        pushNode.next = top;
        top = pushNode;
    }

    T pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        T retval = top.data;
        top = top.next;

        return retval;
    }

    T peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        return top.data;
    }

    void delete() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            top = top.next;
        }
    }
}

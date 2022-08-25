public class MyArrayStack_220522<T> {
    private int top;
    private int stackSize;
    private T[] stack;

    MyArrayStack_220522(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stack = (T[]) new Object[stackSize];
    }

    boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }

    boolean isFull() {
        if(top == stackSize-1) return true;
        else return false;
    }

    void push (T item) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            stack[++top] = item;
        }
    }

    T pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return stack[top--];
    }

    T peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return stack[top];
    }

    void delete() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            stack[top--] = null;
        }
    }
}

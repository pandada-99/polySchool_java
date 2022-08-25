// 220503 인공지능개론(강교수님)
public class MyArrayStack_220503<T> {
    private int top;
    private int stackSize;
    private T[] stack;

    MyArrayStack_220503(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stack = (T[]) new Object[stackSize];
    }

    boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    boolean isFull() {
        if (top == stackSize-1) return true;
        else return false;
    }

    void push (T item) {
        if (isFull()) {
            System.out.println("Stack is Full");
        }
        else {
            stack[++top] = item;
        }
    }

    T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null; // pop 매서드는 T를 리턴해야하니까 null을 리턴 (리턴 없으면 오류남)
        }

        return stack[top--];
    }

    T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        return stack[top];
    }

    void delete() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            stack[top--] = null;
        }
    }
}

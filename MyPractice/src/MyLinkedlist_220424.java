public class MyLinkedlist_220424 <T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;

    MyLinkedlist_220424() {
        head = null;
        size = 0;
    }

    void add(T element) {
        Node insertNode = new Node(element);

        if (head == null) {
            head = insertNode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = insertNode;
        }
        ++size;
    }

    int lenght() {
        return this.size;
    }

    // index번째의 노드를 리턴해주는 내부 method
    private Node getNode (int index) {
        if (index <0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        for (int i = 0; i < index; ++i) {
            temp = temp.next;
        }
        return temp;
    }

    T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return getNode(index).data;
    }

    void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) {
           Node insertNode = new Node(element, head);
           head = insertNode;
        }
        else {
            Node prevNode = getNode(index-1);
            Node insertNode = new Node(element, prevNode.next);
            prevNode.next = insertNode;
        }
    }

    T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T element = get(index);

        if(index == 0) {
            head = head.next;
        }
        else {
            Node prevNode = getNode(index-1);
            prevNode.next = prevNode.next.next;
        }
        --size;

        return element;
    }
}

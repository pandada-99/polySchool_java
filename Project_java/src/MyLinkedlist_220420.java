// 220420 자료구조(강교수님)
public class MyLinkedlist_220420<T> {
    private class Node {
        T data;
        Node next;

        // node의 생성자
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private Node head;

    MyLinkedlist_220420() {
        head = null;
        size = 0;
    }

    void add(T element) {
        if (head == null) {
            head = new Node(element); // new Node 할때 메모리에 잡힘
        } else {
            Node temp = head;

            // 맨 마지막 노드를 찾는다. 마지막 노드의 next는 null 이다.
            while (temp.next != null) {
                temp = temp.next;
            }
            // 마지막 노드의 next가 새로운 노드가 되어야 한다.
            temp.next = new Node(element);
        }
        ++size; // 하나 추가했으니 size도 하나 up
    }

    int length() {
        return size;
    }

//    T get(int index) {
//        if(index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException();
//        }
//
//        Node temp = head;
//        for (int i = 0; i < index; ++i) {
//            temp = temp.next;
//        }
//        return temp.data;
//    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
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
        Node temp = getNode(index);
        return temp.data;
    }

    void add(int index, T element) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        Node insertNode = new Node(element); // 새로 추가할 노드 (새 메모리 하나 잡기)
        if (index == 0) {
            insertNode.next = head;
            head = insertNode;
        }
        else {
            Node prevNode = getNode(index-1);
            insertNode.next = prevNode.next;
            prevNode.next = insertNode;
        }
        ++size;
    }

    T remove(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T element = get(index); // 삭제할 원소 뽑아두기, 나중에 return 할꺼임

        if (index == 0){
            head = head.next;
        }
        else {
            Node prevNode = getNode(index-1);
            prevNode.next = prevNode.next.next;
        }
        --size;
        return element;
    }

    void clear() {
        head = null;
        size = 0;
    }
}

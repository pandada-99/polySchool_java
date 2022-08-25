import java.util.LinkedList;
import java.util.Queue;

public class MyTree_220610<T> {
    private class Node {
        T data;
        Node left;
        Node right;
        Node (T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int n_node;

    MyTree_220610() {
        root = null;
        n_node = 0;
    }

    void insert(T data) {
        Node insertNode = new Node(data);

        if(root == null) {
            root = insertNode;
        }

        else {
            // BFS(넓이우선탐색)해서 빈자리 나오면 넣는다.
            Queue<Node> q = new LinkedList<>();
            q.add(root);

            while(q.isEmpty() == false) {
                Node curNode = q.poll();

                if(curNode.left == null) {
                    curNode.left = insertNode;
                    break;
                }
                else if(curNode.right == null) {
                    curNode.right = insertNode;
                    break;
                }
                else {
                    q.add(curNode.left);
                    q.add(curNode.right);
                }
            }

            n_node++;
        }
    }

    void preorder() {
        preorder(root);
    }
    private void preorder(Node startNode) {
        if(startNode != null) {
            System.out.print(startNode.data.toString());
            preorder(startNode.left);
            preorder(startNode.right);
        }
    }

    void inorder() {
        inorder(root);
    }
    private void inorder(Node startNode) {
        if(startNode != null) {
            inorder(startNode.left);
            System.out.print(startNode.data.toString());
            inorder(startNode.right);
        }
    }

    void postorder() {
        postorder(root);
    }
    private void postorder(Node startNode) {
        if(startNode != null) {
            postorder(startNode.left);
            postorder(startNode.right);
            System.out.print(startNode.data.toString());
        }
    }
}

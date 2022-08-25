// 220608 자료구조(강교수님)
public class Project_220608 {
    public static void main(String[] args) {
        MySort_220520 s = new MySort_220520();
        int[] data = {69, 10, 30, 2, 16, 8, 31, 22};

        s.quickSort(data, 0, data.length-1, false);
//        System.out.println();
//        s.quickSort(data, 0, data.length-1, true);
        System.out.println();
//
//
//
// 220610 자료구조(강교수님)
        MyTree_220610<String> tree = new MyTree_220610<>();
        tree.insert("-");
        tree.insert("*");
        tree.insert("/");
        tree.insert("A");
        tree.insert("B");
        tree.insert("C");
        tree.insert("D");

        tree.preorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postorder();
    }
}

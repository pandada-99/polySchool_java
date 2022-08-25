public class Project_220510 {
    public static void main(String[] args) {
        MyLinkedCQue_220510<String> que = new MyLinkedCQue_220510<>();
        que.push("이은정");
        que.push("이은주");
        que.push("최비결");
        que.push("안원영");
        System.out.println(que.pop());
        que.push("장민규");
        System.out.println(que.peek());
        que.delete();
        System.out.println(que.peek());
    }
}

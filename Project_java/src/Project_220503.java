import java.util.EmptyStackException;
import java.util.Stack;

class parenthesis {

//    // num을 여는 괄호로 세는 함수
//    static int real_num (String st, int num) {
//        MyLinkedStack_220503<Integer> testnum = new MyLinkedStack_220503();
//        int realnum = 0;
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == '(') {
//                if (testnum.peek() == num) {
//                    realnum = i+1;
//                }
//            }
//        }
//        return realnum;
//    }

    static int pair_test (String st, int num) {
        MyLinkedStack_220503<Integer> testOpen = new MyLinkedStack_220503<>();
        int result = 0;
        int realnum = 0;
        int count = 0;

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '(') {
                testOpen.push(i);
                count++;
                if (count == num) {
                    realnum = i;
                }
            }
            else if (st.charAt(i) == ')') {
                if (testOpen.isEmpty()){
                    return 0;
                }
                if (testOpen.pop() == realnum) {
                    result = i+1;
                }
            }
        }
        if (testOpen.isEmpty() == false) return 0;

        return result;
    }
}

public class Project_220503 {
    public static void main(String[] args) {
        MyLinkedStack_220503<String> stack = new MyLinkedStack_220503<>();
        stack.push("이은정");
        stack.push("이은주");
        stack.push("강현우");
        stack.push("이근혁");
        stack.push("오수은");
        stack.push("표주혁");

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        stack.delete();
//        System.out.println(stack.peek());


        // 스택응용문제: 괄호 유효여부와 짝찾기
        String test1 = "(()()(()))";
        String test2 = "))()(())";
        String test3 = "((())((()))(()))";

        int answer = parenthesis.pair_test(test1, 1);
        System.out.println(answer);


        //  괄호 짝 맞추기 문제 (try/catch문으로 풀기)
        String inputString = "((()))";
        int N = 2;
        int ans = 0;

        Stack<Integer> open_stack = new Stack<>();
        char[] inputArray = inputString.toCharArray();
        int count = 0;

        try {
            for (int i = 0; i < inputArray.length; ++i) {
                if (inputArray[i] == '(') {
                    open_stack.push(++count);
                }
                else if (inputArray[i] == ')') {
                    int temp = open_stack.pop();
                    if (temp == N) {
                        ans = i + 1;
                    }
                }
            }
        }
        catch(EmptyStackException e) {
            ans = 0;
        }
        finally {
            if (open_stack.size() > 0) ans = 0;
        }

        System.out.println("answer is: " + ans);

    }
}

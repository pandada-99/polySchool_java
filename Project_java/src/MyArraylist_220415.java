// 220415 자료구조(강교수님)
public class MyArraylist_220415 <T>{
    private T[] array;
    private int size;
    private int MAX_SIZE = 1;

    MyArraylist_220415() {
        array = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    void add(T element) {
        // 예외처리
        if (size >= MAX_SIZE) {
            // 원래 크기보다 2배인 배열을 임시로 생성함.
            T[] temp = (T[]) new Object[MAX_SIZE*2];
            // 원래 가진 데이터들을 복사함.
            for (int i = 0; i < size; ++i) {
                temp[i] = array[i];
            }
            MAX_SIZE *= 2; // MAX_SIZE는 이제 2배
            array = temp; // 진짜 원소들이 복사돼서 들어가는게 아니라 temp주소값이 array로 할당되는것

            System.out.println("여기로 들어오면 2배 됐음. 지금 size는 " + MAX_SIZE);
        }
        // 삽입하는 코드
        array[size] = element;
        ++size;
    }

    void add (int index, T element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        // 일단 맨뒤로 add함
        add(element); // add해서 사이즈가 이미 하나 늘어나있음

        // index 다음 원소들를 우측으로 하나씩 shift
        for (int i = size-2; i >= index; --i) {
            array[i+1] = array[i];
        }
        //for(int i = size-1; i>index; --i) {
        //            array[i] = array[i-1];
        //        } 와 동일함.

        // index번째에 새로운 element를 넣는다.
        array[index] = element;
    }

    T get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    int length() {
        return size;
    }

    T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // 삭제할 값 미리 복사해두기
        T ret = array[index];

        // 하나씩 빈칸으로 옮긴다
        for (int i = index; i < size-1; ++i) {
            array[i] = array[i+1];
        }
        //for (int i = index+1; i < size; --i) {
        //            array[i-1] = array[i];
        //        } 와 동일함.

        // 크기를 하나 줄여준다.
        --size;

        // 복사해둔값 return
        return ret;
    }
}
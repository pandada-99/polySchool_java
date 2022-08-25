public class MyArraylist_220413<T> { // public어야 다른 파일에서 쓸 수 있음.
    // 멤버 변수
    private int size;
    private T[] array; //'T' type array (T: 어느 type이 올지 모른다.)
    private int MAX_SIZE = 10;

    public MyArraylist_220413() {
        array = (T[]) new Object[MAX_SIZE];
//        int[] a = new int[10];
        size = 0;
    }

    void add(T element) { // void: return값이 없음.
        if (size >= MAX_SIZE) {
            this.MAX_SIZE *= 2;
            T[] bigger = (T[]) new Object[MAX_SIZE];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
//            throw new IndexOutOfBoundsException();
        }
        array[size] = element;
        ++size;
    }

    int size() {
        return size;
    }

    void add(int index, T element) {
        // add method 호출
        add(element);
        // 옆으로 옮기기
        for(int i = size-1; i>index; --i) {
            array[i] = array[i-1];
        }
        // index자리에 재배치
        array[index] = element;
//        ++size; 위에 add하면서 더했기했문에 할필요없다.
    }

    T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        T element = get(index);

        // 삭제한 자리만큼 당겨준다.
        for (int i = index; i < size-1; ++i) {
            array[i] = array[i+1];
        }
        --size;

        return element;
    }

    void clear() {
        size = 0;
    }
}
public class MyArraylist_220421<T> {
    private T[] array;
    private int size;
    private int MAX_SIZE = 5;

    MyArraylist_220421() {
        array = (T[]) new Object[MAX_SIZE];
        size = 0;
    }

    void add(T element) {
        if (size >= MAX_SIZE) {
            T[] temp = (T[]) new Object[MAX_SIZE*2];
            for (int i = 0; i < size; ++i) {
                temp[i] = array[i];
            }
            MAX_SIZE *= 2;
            array = temp;
        }
        array[size] = element;
        ++size;
    }

    void add(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        add(element);
        for (int i = size-2; i >= index; --i) {
            array[i + 1] = array[i];
        }
        array[index] = element;
    }

    T get(int index) {
        if (index < 0 || index >= size) {
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

        T rem = array[index];

        for (int i = index; i < size-1; ++i) {
            array[i] = array[i+1];
        }
        --size;

        return rem;
    }
}
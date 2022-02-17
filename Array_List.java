public class Array_List<T> {
    private int capacity = 10;
    private T[] array;
    private int iter = 0;

    public Array_List() {
        array = (T[]) new Object[capacity];
    }

    public Array_List(int size) {
        capacity = size;
        array = (T[]) new Object[size];
    }

    public void add(T element) {
        if (iter == array.length - 1)
            rewrite((capacity * 3) / 2 + 1);
        array[iter++] = element;
    }

    public void add(int index, T element) {
        if (iter == array.length - 1)
            rewrite((capacity * 3) / 2 + 1);
        T[] new_array =(T[]) new Object[capacity];
        for (int i = 0; i < index; i++)
            new_array[i] = array[i];
        for (int i = index; i < iter; i++)
            new_array[i + 1] = array[i];
        new_array[index] = element;
        array = new_array;
        iter++;
    }

    public void delete(int index) {
        if (iter < index)
            System.out.println("Element doesn't exist");
        else {
            for (int i = index; i < iter; i++)
                array[i] = array[i + 1];
            array[--iter] = null;
        }
    }

    public T get(int index) {
        return array[index];
    }

    public int get_size() {
        return iter;
    }

    public int get_capacity() {
        return capacity;
    }

    public void rewrite(int new_capacity) {
        capacity = new_capacity;
        T[] new_array =(T[]) new Object[new_capacity];
        for (int i = 0; i < iter; i++)
            new_array[i] = array[i];
        array = new_array;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iter; i++) {
            sb.append(array[i]);
            sb.append(' ');
        }
        return sb.toString();
    }
}

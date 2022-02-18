package main;

import java.util.Comparator;

public class Array_List<T> implements List<T>{
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
        if (index < 0 || index > iter)
            throw new ArrayIndexOutOfBoundsException("Index isn't correct");
        if (iter + 1 == array.length - 1)
            rewrite((capacity * 3) / 2 + 1);
        System.arraycopy(array, index, array, index + 1, iter - index);
        array[index] = element;
        iter++;
    }

    public void delete(int index) {
        if (index < 0 || (Integer) index == null)
            throw new ArrayIndexOutOfBoundsException("Index isn't correct");
        if (iter < index)
            throw new ArrayIndexOutOfBoundsException("Element at given index doesn't exist");
        else {
            System.arraycopy(array, index + 1, array, index, iter - index - 1);
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
        System.arraycopy(array, 0, new_array, 0, iter);
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

    public void sort (int left_position, int right_position, Comparator<T> comparator) {
        if (this.get_size() == 0) return;
        if (left_position >= right_position) return;
        int middle_position = left_position + (right_position - left_position) / 2;
        T pivot = this.get(middle_position);
        int i = left_position, j = right_position;
        while (i <= j) {
            while (comparator.compare(pivot ,this.get(i)) > 0)
                i++;
            while (comparator.compare(pivot ,this.get(j)) < 0)
                j--;
            if (i <= j) {
                T tmp = this.get(i);
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        if (left_position < j)
            sort(left_position, j, comparator);
        if (right_position > i)
            sort(i, right_position, comparator);
    }
}
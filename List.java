package main;

import java.util.Comparator;

public interface List<T> {
    void add(T element);
    void add(int index, T element);
    void delete(int index);
    T get(int index);
    int get_size();
    int get_capacity();
    void rewrite(int new_capacity);
    String toString();
    void sort (int left_position, int right_position, Comparator<T> comparator);
}
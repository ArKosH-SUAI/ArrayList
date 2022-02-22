/**
 * @author Philipp Raevskiy
 * My realization of the List interface
 */
public interface List<T> {
    void add(T element);
    void add(int index, T element);
    void delete(int index);
    T get(int index);
    int get_size();
    int get_capacity();
    void rewrite();
    String toString();
}

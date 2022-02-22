/**
 * @author Philipp Raevskiy
 * This is my ArryaList implementation
 */
public class Array_List<T> implements List<T>{
    private int capacity = 10;
    private Object[] array;
    private int iter = 0;
    private final Object[] empty_array = {};
    private final Object[] def_empty_array = {};
    /**
     * Empty ArrayList constructor
     */
    public Array_List() {
        array = def_empty_array;
    }

    /**
     * An ArrayList constructor that creates a given size
     * @param size ArrayList size
     */
    public Array_List(int size) {
        if (size > 0) {
            capacity = size;
            array = new Object[size];
        } else if (size == 0) {
            capacity = 0;
            array = empty_array;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+ size);
        }
    }

    /**
     * A method that adds an element to the end of the list
     * @param element the element that needs to be added
     */
    public void add(T element) {
        if (iter == array.length)
            rewrite();
        array[iter] = element;
        iter += 1;
    }

    /**
     * A method that adds an element to a given position
     * @param index the position to add the element to
     * @param element the element that needs to be added
     */
    public void add(int index, T element) {
        if (index < 0 || index > iter)
            throw new ArrayIndexOutOfBoundsException("Index isn't correct");
        if (iter == array.length)
            rewrite();
        System.arraycopy(array, index, array, index + 1, iter - index);
        array[index] = element;
        iter += 1;
    }

    /**
     * A method that removes an element at a given position
     * @param index the position from which the element should be removed
     */
    public void delete(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("Index isn't correct");
        if (iter < index)
            throw new ArrayIndexOutOfBoundsException("Element at given index doesn't exist");
        else {
            System.arraycopy(array, index + 1, array, index, iter - index - 1);
            array[--iter] = null;
        }
    }

    /**
     * A method that returns the value of a list item from a given position
     * @param index the position from which to return the value of the element
     */
    public T get(int index) {
        if (index < 0)
            throw new ArrayIndexOutOfBoundsException("Index isn't correct");
        if (iter < index)
            throw new ArrayIndexOutOfBoundsException("Element at given index doesn't exist");
        return (T)array[index];
    }

    /**
     * A method that returns the size of the list
     */
    public int get_size() {
        return iter;
    }

    /**
     * A method that returns the capacity of the list
     */
    public int get_capacity() {
        return capacity;
    }

    /**
     * A method that increases the capacity of the list
     */
    public void rewrite() {
        if (array == def_empty_array) {
            array = new Object[capacity];
        } else if (array == empty_array) {
            capacity += 1;
            array = new Object[capacity];
        } else {
            capacity = (capacity * 3) / 2 + 1;
            T[] new_array =(T[]) new Object[capacity];
            System.arraycopy(array, 0, new_array, 0, iter);
            array = new_array;
        }
    }

    /**
     * Method for forming a string representation of data in a list
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iter; i++) {
            sb.append(array[i]);
            if (i + 1 < iter) sb.append(' ');
        }
        return sb.toString();
    }
}
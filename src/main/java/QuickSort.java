import java.util.Comparator;

/**
 * @author Philipp Raevskiy
 * My realization of QuickSort for the List
 */
public class QuickSort<T> {

    /**
     * The method realize a quick sorting algorithm of the list
     * @param list the list in which the data is stored
     * @param left_position left position of the sorting border
     * @param right_position right position of the sorting border
     * @param comparator the rule by which sorting will be performed
     */
    public static <T> void sort (List<T> list ,int left_position, int right_position, Comparator<T> comparator) {
        if (list.get_size() == 0) return;
        if (left_position >= right_position) return;
        int middle_position = left_position + (right_position - left_position) / 2;
        T pivot = list.get(middle_position);
        int i = left_position, j = right_position;
        while (i <= j) {
            while (comparator.compare(pivot, list.get(i)) > 0)
                i++;
            while (comparator.compare(pivot, list.get(j)) < 0)
                j--;
            if (i <= j) {
                T tmp = list.get(j);
                list.delete(j);
                list.add(j, list.get(i));
                list.delete(i);
                list.add(i, tmp);
                i++;
                j--;
            }
        }
        if (left_position < j)
            sort(list, left_position, j, comparator);
        if (right_position > i)
            sort(list, i, right_position, comparator);
    }
}

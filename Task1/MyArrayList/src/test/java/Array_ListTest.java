import static org.junit.jupiter.api.Assertions.*;

class Array_ListTest {

    @org.junit.jupiter.api.Test
    void shouldAddElementAtTheEndOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.get(2), 3);
    }

    @org.junit.jupiter.api.Test
    void shouldAddElementFromAGivenPositionOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 6);

        assertEquals(list.get(1), 6);
    }

    @org.junit.jupiter.api.Test
    void shouldDeleteElementFromAGivenPositionOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.delete(1);

        assertNotEquals(list.get(1), 2);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnValueFromAGivenOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(list.get(1), 2);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheSizeOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(list.get_size(), 5);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheCapacityOfTheList() {
        List<Integer> list = new Array_List<>();

        list.add(1);

        assertEquals(list.get_capacity(), 10);
    }

    @org.junit.jupiter.api.Test
    void shouldChangeCapacityOfTheList() {
        List<Integer> list = new Array_List<>();

        list.rewrite(list.get_capacity() + 5);

        assertEquals(list.get_capacity(), 15);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnStringRepresentationOfDataInAList() {
        List<Integer> list = new Array_List<>();

        list.add(1);
        list.add(2);
        list.add(3);
        String str = list.toString();

        assertEquals(str, "1 2 3 ");
    }

    @org.junit.jupiter.api.Test
    void shouldSortDataInAList() {
        List<Integer> list = new Array_List<>();

        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        list.sort(0, list.get_size() - 1, Integer::compareTo);
        String str = list.toString();

        assertEquals(str, "1 2 3 4 5 6 ");
    }
}
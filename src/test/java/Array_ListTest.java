import static org.junit.jupiter.api.Assertions.*;

class Array_ListTest {

    @org.junit.jupiter.api.Test
    void shouldAddElementAtTheEndOfTheList() {
        //
        //Given List [1 2]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);

        //
        //When add 3 to the end
        //
        list.add(3);

        //
        //Then we get List [1 2 3]
        //
        assertEquals(list.toString(), "1 2 3");
    }

    @org.junit.jupiter.api.Test
    void shouldAddElementFromAGivenPositionOfTheList() {
        //
        //Given List [1 2 3]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //
        //When add 6 to 1 position
        //
        list.add(1, 6);

        //
        //Then we get List [1 6 2 3]
        //
        assertEquals(list.toString(), "1 6 2 3");
    }

    @org.junit.jupiter.api.Test
    void shouldDeleteElementFromAGivenPositionOfTheList() {
        //
        //Given List [1 2 3]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //
        //When delete element to 1 position
        //
        list.delete(1);

        //
        //Then get List [1 3]
        //
        assertEquals(list.toString(), "1 3");
    }

    @org.junit.jupiter.api.Test
    void shouldReturnValueFromAGivenOfTheList() {
        //
        //Given List [1 2 3]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //
        //When get the value of the element to 1 position
        //
        int value = list.get(1);

        //
        //Then get element with the value 2
        //
        assertEquals(value, 2);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheSizeOfTheList() {
        //
        //Given List [1 2 3 4 5]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //
        //When get the size of the List
        //
        int size = list.get_size();

        //
        //Then get the size is equal to 5
        //
        assertEquals(size, 5);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnTheCapacityOfTheList() {
        //
        //Given List []
        //
        List<Integer> list = new Array_List<>();

        //
        //When get the capacity of the List
        //
        int capacity = list.get_capacity();

        //
        //Then get the capacity is equal to 10
        //
        assertEquals(capacity, 10);
    }

    @org.junit.jupiter.api.Test
    void shouldChangeCapacityOfTheList() {
        //
        //Given List []
        //
        List<Integer> list = new Array_List<>();

        //
        //When increase the capacity of the List
        //
        list.rewrite();

        //
        //Then get the capacity is equal to 10
        //
        assertEquals(list.get_capacity(), 10);
    }

    @org.junit.jupiter.api.Test
    void shouldReturnStringRepresentationOfDataInAList() {
        //
        //Given List [1 2 3]
        //
        List<Integer> list = new Array_List<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //
        //When forming a string representation of the List
        //
        String str = list.toString();

        //
        //Then get the string "1 2 3"
        //
        assertEquals(str, "1 2 3");
    }

    @org.junit.jupiter.api.Test
    void shouldSortDataInAList() {
        //
        //Given List [5 2 1 4 6 3]
        //
        List<Integer> list = new Array_List<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);

        //
        //When sort the List
        //
        QuickSort.sort(list, 0, list.get_size() - 1, Integer::compareTo);
        String str = list.toString();

        //
        //Then get a sorted List [1 2 3 4 5 6]
        //
        assertEquals(str, "1 2 3 4 5 6");
    }
}
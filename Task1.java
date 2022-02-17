public class Task1 {
    public static void main (String[] args) {
        Array_List<Integer> list_int = new Array_List<>();
        list_int.add(1);
        list_int.add(2);
        list_int.add(4);
        list_int.add(5);
        System.out.println(list_int);
        list_int.add(2, 3);
        System.out.println(list_int);
        list_int.delete(3);
        System.out.println(list_int);

        Array_List<String> list_string = new Array_List<>();
        list_string.add("Max");
        list_string.add("Philipp");
        list_string.add("Vlad");
        list_string.add("Katy");
        System.out.println(list_string);
        list_string.add(4, "Ivan");
        System.out.println(list_string);
        list_string.delete(1);
        System.out.println(list_string);
    }
}

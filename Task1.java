package main;

import java.util.Random;

public class Task1 {
    public static void main (String[] args) {
        List<Integer> list_int = new Array_List<>();
        Random r = new Random();
        for (int i = 0; i <= 20; i++)
            list_int.add(r.nextInt(20));
        System.out.println(list_int);
        list_int.sort(0, list_int.get_size() - 1, Integer::compareTo);
        System.out.println(list_int);

        Array_List<String> list_string = new Array_List<>();
        list_string.add("Max");
        list_string.add("Philipp");
        list_string.add("Vlad");
        list_string.add("Katy");
        System.out.println(list_string);
        list_string.sort(0, list_string.get_size() - 1, String::compareTo);
        System.out.println(list_string);
    }
}

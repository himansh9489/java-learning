package src.CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);

        //add element in between
        list.add(1,2); // 1 is the index and 2 is the element to be added
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Sorting the list
        list.add(0);
        Collections.sort(list,Collections.reverseOrder());
        //Collections.reverse(list);
        System.out.println(list);
    }
}

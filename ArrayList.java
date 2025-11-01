import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
    public static void main(String args[]) {
        // ArrayList<String> list = new ArrayList<>();

        // list.add("Ayush");
        // list.add("is");
        // list.add("a");
        // list.add("good");
        // list.add("boy");

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        //  get elemet at index  3
        int  element = list.get(3);
        System.out.println(element);
        //  add element at index 1 
        list.add(1,889);
        System.out.println(list);
        //  delete element at index
        list.remove(1);
        System.out.println(list);
        //  set of elemnt of index 2 
        list.set(2, 77);
        System.out.println(list);
        // size
        int size = list.size();
        System.out.println(size);
        // sorting 
        Collections.sort(list);
        System.out.println(list);
        //  loops
        for(int i =0 ; i<list.size();i++){
            System.out.print(list.get(i));
        }

}}
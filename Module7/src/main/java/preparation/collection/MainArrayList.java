package main.java.preparation.collection;

import java.util.*;

public class MainArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        for (String element : list) {
            System.out.println(element);
        }

        System.out.println("-".repeat(15));

        list.add(0,"Sixth");
        list.remove(1);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //iterator.remove();
        }

        System.out.println("-".repeat(15));

        Collections.sort(list);
        for (String element : list) {
            System.out.println(element);
        }

    }
}

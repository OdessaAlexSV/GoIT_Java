package main.java.preparation.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();

        collection.add("First");
        collection.add("Second");
        collection.add("Third");

        printIterator(collection);
        System.out.println();
        printForEach(collection);
        System.out.println("Size collection before deleting : " + collection.size());
        removeElements(collection);
        System.out.println("Size collection after deleting : " + collection.size());
    }

    private static void removeElements(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }

    private static void printForEach(Collection<String> collection) {
        for (String element : collection) {
            System.out.println(element);
            //collection.remove(element); - ERROR!!!
        }
    }

    private static void printIterator(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

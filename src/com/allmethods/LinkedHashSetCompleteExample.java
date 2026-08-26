package com.allmethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Spliterator;

public class LinkedHashSetCompleteExample {
    public static void main(String[] args) {
        
        // 1. Creating a LinkedHashSet (using default constructor)
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // 2. add(E e) - Adds elements and maintains insertion order
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Initial LinkedHashSet: " + set);

        // 3. addFirst(E e) & addLast(E e) - Sequenced Collection methods
        set.addFirst("Mango");
        set.addLast("Dragonfruit");
        System.out.println("After addFirst and addLast: " + set);

        // 4. getFirst() & getLast() - Retrieves elements without removing
        System.out.println("First Element: " + set.getFirst());
        System.out.println("Last Element: " + set.getLast());

        // 5. contains(Object o) - Checks if element exists
        System.out.println("Contains 'Banana'?: " + set.contains("Banana"));

        // 6. size() - Returns the total number of elements
        System.out.println("Size of set: " + set.size());

        // 7. isEmpty() - Checks if the set has elements
        System.out.println("Is set empty?: " + set.isEmpty());

        // 8. iterator() - Iterates over elements sequentially
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) 
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 9. reversed() - Returns a reverse-order view of the set
        SequencedSet<String> reversedSet = set.reversed();
        System.out.println("Reversed view: " + reversedSet);

        // 10. remove(Object o) - Removes a specific element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // 11. removeFirst() & removeLast() - Removes from ends
        String removedFirst = set.removeFirst();
        String removedLast = set.removeLast();
        System.out.println("Removed First: " + removedFirst + " | Removed Last: " + removedLast);
        System.out.println("Current set: " + set);

        // 12. Bulk Operations Setup (Creating a collection for comparison)
        ArrayList<String> modernFruits = new ArrayList<>();
        modernFruits.add("Apple");
        modernFruits.add("Kiwi");
        modernFruits.add("Berry");

        // 13. addAll(Collection c) - Adds all items from another collection
        set.addAll(modernFruits);
        System.out.println("After addAll: " + set);

        // 14. containsAll(Collection c) - Verifies if all elements exist
        System.out.println("Contains all 'modernFruits'?: " + set.containsAll(modernFruits));

        // 15. spliterator() - Creates a late-binding spliterator
        Spliterator<String> spliterator = set.spliterator();
        System.out.print("Spliterator output: ");
        spliterator.forEachRemaining(element -> System.out.print(element + " "));
        System.out.println();

        // 16. clone() - Creates a shallow copy of the instance
        @SuppressWarnings("unchecked")
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) set.clone();
        System.out.println("Cloned LinkedHashSet: " + clonedSet);

        // 17. toArray() - Converts set to an array
        Object[] array = set.toArray();
        System.out.println("Array length: " + array.length);

        // 18. retainAll(Collection c) - Keeps only shared elements (Intersection)
        set.retainAll(modernFruits);
        System.out.println("After retainAll (intersection with modernFruits): " + set);

        // 19. removeAll(Collection c) - Removes matching collection items
        set.removeAll(modernFruits);
        System.out.println("After removeAll (should be empty): " + set);

        // 20. clear() - Removes everything completely
        clonedSet.clear();
        System.out.println("Cloned set after clear(): " + clonedSet);
    }
}


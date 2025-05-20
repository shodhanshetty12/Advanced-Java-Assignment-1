//Q1.a: Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
//and a LinkedList to perform the following operations:
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements,
//4. Accessing elements, 5. Updating elements, 6. Removing elements, 7. Searching elements,
//8. List size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package listOperation_1a;

import java.util.*;

public class ListOperations {
 public static void main(String[] args) {
     // Initial elements
     List<String> initialFruits = Arrays.asList("Apple", "Banana", "Orange");

     // Using ArrayList
     System.out.println("=== ArrayList Operations ===");
     List<String> arrayList = new ArrayList<>(initialFruits);

     // 1. Add element
     arrayList.add("Grapes");
     System.out.println("After adding: " + arrayList);

     // 2. Add element at specific index
     arrayList.add(1, "Pineapple");
     System.out.println("After adding at index 1: " + arrayList);

     // 3. Add multiple elements
     arrayList.addAll(Arrays.asList("Mango", "Papaya"));
     System.out.println("After adding multiple: " + arrayList);

     // 4. Accessing elements
     System.out.println("Element at index 2: " + arrayList.get(2));

     // 5. Updating elements
     arrayList.set(2, "Strawberry");
     System.out.println("After update at index 2: " + arrayList);

     // 6. Removing elements
     arrayList.remove("Papaya");
     arrayList.remove(0); // Remove first
     System.out.println("After removal: " + arrayList);

     // 7. Searching elements
     System.out.println("Contains Mango? " + arrayList.contains("Mango"));

     // 8. List size
     System.out.println("List size: " + arrayList.size());

     // 9. Iterating over list (for-each)
     System.out.println("Iterating using for-each:");
     for (String fruit : arrayList) {
         System.out.println(fruit);
     }

     // 10. Using Iterator
     System.out.println("Iterating using Iterator:");
     Iterator<String> iterator1 = arrayList.iterator();
     while (iterator1.hasNext()) {
         System.out.println(iterator1.next());
     }

     // 11. Sorting
     Collections.sort(arrayList);
     System.out.println("Sorted list: " + arrayList);

     // 12. Sublist
     List<String> subArrayList = arrayList.subList(0, 2);
     System.out.println("Sublist (0 to 2): " + subArrayList);

     // 13. Clearing the list
     arrayList.clear();
     System.out.println("After clearing: " + arrayList);

     // Using LinkedList
     System.out.println("\n=== LinkedList Operations ===");
     LinkedList<String> linkedList = new LinkedList<>(initialFruits);

     // 1. Add element
     linkedList.add("Grapes");
     System.out.println("After adding: " + linkedList);

     // 2. Add element at specific index
     linkedList.add(1, "Pineapple");
     System.out.println("After adding at index 1: " + linkedList);

     // 3. Add multiple elements
     linkedList.addAll(Arrays.asList("Mango", "Papaya"));
     System.out.println("After adding multiple: " + linkedList);

     // 4. Accessing elements
     System.out.println("Element at index 2: " + linkedList.get(2));

     // 5. Updating elements
     linkedList.set(2, "Strawberry");
     System.out.println("After update at index 2: " + linkedList);

     // 6. Removing elements
     linkedList.remove("Papaya");
     linkedList.remove(0); // Remove first
     System.out.println("After removal: " + linkedList);

     // 7. Searching elements
     System.out.println("Contains Mango? " + linkedList.contains("Mango"));

     // 8. List size
     System.out.println("List size: " + linkedList.size());

     // 9. Iterating over list (for-each)
     System.out.println("Iterating using for-each:");
     for (String fruit : linkedList) {
         System.out.println(fruit);
     }

     // 10. Using Iterator
     System.out.println("Iterating using Iterator:");
     Iterator<String> iterator2 = linkedList.iterator();
     while (iterator2.hasNext()) {
         System.out.println(iterator2.next());
     }

     // 11. Sorting
     Collections.sort(linkedList);
     System.out.println("Sorted list: " + linkedList);

     // 12. Sublist
     List<String> subLinkedList = linkedList.subList(0, 2);
     System.out.println("Sublist (0 to 2): " + subLinkedList);

     // 13. Clearing the list
     linkedList.clear();
     System.out.println("After clearing: " + linkedList);
 }
}

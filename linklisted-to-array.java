import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Add elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        
        // Convert the linked list to an array
        Integer[] array = linkedList.toArray(new Integer[0]);
        
        // Print the array
        System.out.println("Array:");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
    }
}

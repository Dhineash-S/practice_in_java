import java.util.*;

public class prbm_38 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        System.out.println("Original List:");
        list.printList();
        
        System.out.println("Reversed List:");
        list.reverse();
        list.printList();
        
        System.out.println("Middle Node: " + list.findMiddle().data);
    }
}


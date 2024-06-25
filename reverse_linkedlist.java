/*reversing the linked list element */
import java.util.*;
public class reverse_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> color= new LinkedList<>();
        color.add(1);
        color.add(2);
        color.add(3);
        color.add(4);
        color.add(5);
        System.out.println(color);
        System.out.println("after reverse the element "+color.reversed());
        for(int i=color.size()-1;i>=0;i--){
            
            System.out.println("reversing element using for loop "+color.get(i));
        }
    
    }
    
}
/*Output :
[1, 2, 3, 4, 5]
after reverse the element [5, 4, 3, 2, 1]
reversing element using for loop5
reversing element using for loop4
reversing element using for loop3
reversing element using for loop2
reversing element using for loop1
*/

import java.util.*;
public class basic_method{

    public static void main(String args[]) {
        LinkedList<String> val=new LinkedList<>();
        val.add("hello");
        val.add("java");
        val.add("program");
        val.add("linkedlist");
        System.out.println("element in linkedlist "+val);
        // adding element in linked list
        val.add("hiii");
        val.add("hello");
        System.out.println("adding the elementlinkedlist "+val);
        // getting element in linkedlist
        System.out.println("getting element by first  "+val.getFirst());
        System.out.println("getting element by last  "+val.getLast());
        System.out.println("getting element by index  "+val.get(3));
        // setting the element in linkedlist
        val.set(4, "java");
        System.out.println(val);
        //finding the size of element
        System.out.println(val.size());
        // removing the element in the linked list
        val.removeFirst();
        System.out.println("removing the 1st element in linkedlist "+val);
        val.removeLast();
        System.out.println("removing the last element in linkedlist"+val);
        val.removeFirstOccurrence("lap");
        System.out.println("removing the 1st occurrence element in linkedlist"+val);
        val.removeLastOccurrence("lap");
        System.out.println("removing the last occurenece in linkedlist"+val);


      
    }
}




/*output:
 element in linkedlist [hello, java, program, linkedlist]
adding the elementlinkedlist [hello, java, program, linkedlist, hiii, hello]
getting element by first  hello
getting element by last  hello
getting element by index  linkedlist
[hello, java, program, linkedlist, java, hello]
6
removing the 1st element in linkedlist [java, program, linkedlist, java, hello]
removing the last element in linkedlist[java, program, linkedlist, java]
removing the 1st occurrence element in linkedlist[java, program, linkedlist, java]
removing the last occurenece in linkedlist[java, program, linkedlist, java]
 */
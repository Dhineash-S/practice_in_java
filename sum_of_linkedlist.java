// SUM OF TOW INTEGER VALUE IN LINKEDLIST
import java.util.*;
public class sum_of_linkedlist {
    public static void main(String[] args) {
    LinkedList<Integer> val=new LinkedList<>();
    val.add(10);
    val.add(20);
    int count=0;
    for(int sum:val){
        count=count+sum;
    }
    System.out.println(count);



    }
}
/*
 * output : 
 *      30
 */
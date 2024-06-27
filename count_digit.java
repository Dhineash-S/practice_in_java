// count the number of digit in given number
import java.util.*;
public class count_digit {
            public static void main(String[]args){
               // LinkedList<Integer> sub= new LinkedList<>();
                Scanner x=new Scanner(System.in);
                System.out.print("enter the your digit ");
                long sum =x.nextInt();
                long rem=0;
                int count=0;
                while(sum!=0){
                    rem=sum%10;
                    sum=sum/10;
                    count++;
                }
                System.out.println(count);

            }    
}
/*
 * output:
 * enter the your digit 1234567890
10
 */

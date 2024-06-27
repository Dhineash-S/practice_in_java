// find the number is negative or positive
import java.util.*;
public class pos_neg {
    public static void main(String[] args) {
        System.out.print("enter the integer number ");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        if(a==0){
                System.out.println("is zero"); 
                return;
        }
        else if(a>0){
            System.out.println("is positive");
        }
        else{
            System.out.println("is negative");
        }
        }
    }
    /*
     output:
        enter the integer number 43
        is positive
        enter the integer number 0
        is zero
        enter the integer number -1
       is negative
     */

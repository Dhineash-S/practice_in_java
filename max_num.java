// find the greatest 3 number using if else
import java.util.*;
public class max_num {
public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int a=x.nextInt();
    int b=x.nextInt();
    int c=x.nextInt();
    if(a<b){
        if(b>c){
            System.out.print(b+" is greater");
        }
        else{
            System.out.print(c+" is greater");
        }

    }
    else{
        System.out.print(a+" is greater");
    }
}
}
/*
 * output:
 * 12
   13
   14
 14 is greater
 */
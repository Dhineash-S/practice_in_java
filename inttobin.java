// integer to binary
import java.util.*;
public class inttobin {

  public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.print("enter the integer :");
    int a=x.nextInt();
    String op=Integer.toBinaryString(a);
    System.out.print("your binary value is :"+op);
  }
}
/*
 output:
 enter the integer :101
your binary value is :110010
 */
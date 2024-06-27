import java.util.*;
public class sum_average {
 public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("enter the 5 subject mark");
    int a1=x.nextInt();
    int a2=x.nextInt();
    int a3=x.nextInt();
    int a4=x.nextInt();
    int a5=x.nextInt();
    int sum=a1+a2+a3+a4+a5;
    int avg=sum/5;
    System.out.println("sum = "+sum+"average = "+avg);

  
 }   
}
/*
output:
 enter the 5 subject mark
67
87
69
90
100
sum = 413average = 82
 */

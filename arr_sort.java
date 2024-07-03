// sorting of an array
import java.util.*;
public class arr_sort{
  public static void main(String args[]){
    Scanner x=new Scanner(System.in);
    System.out.print("enter the size of arr ");
    int a=x.nextInt();
    int arr[]=new int[a];
    System.out.print("enter the element ");
    for(int i=0;i<a;i++){
      arr[i]=x.nextInt();
    }
    Arrays.sort(arr);
    for(int i=0;i<a;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
/*
  output:
enter the size of arr 4
enter the element 12
34
45
67
12 34 45 67 
 */
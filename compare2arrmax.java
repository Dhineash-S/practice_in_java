// comparing two array and finding the greatest element in array
import java.util.*;
public class compare2arrmax {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the arr1 size :");
        int a =s.nextInt();
        System.out.print("enter the arr2 size :");
        int b=s.nextInt();
        System.out.println("~~~~~~~~~~");
        int arr1[]=new int[a];
        int arr2[]=new int [b];
        System.out.println("arr1 element");
        for (int i=0;i<a;i++){
           
           arr1[i]=s.nextInt();
        }
       
        System.out.println("~~~~~~~~~~");
        System.out.println("arr2 element");
        for (int j=0;j<b;j++){
            
            arr2[j]=s.nextInt();
        } 
            System.out.println("~~~~~~~~~~");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
         //   System.out.println(arr1+" "+arr2+" ");
        if(arr1[a-1]<arr2[b-1]){
            System.out.println("greatest element ="+arr2[b-1]);

        }else{
            System.out.println("greatest element ="+arr1[a-1]);
        }
        System.out.println("~~~~~~~~~~");
    
    }
}
/*
 * output:
 * enter the arr1 size :4
enter the arr2 size :5
~~~~~~~~~~  
arr1 element
2
3
5
7
~~~~~~~~~~
arr2 element
8
9
1
4
6
~~~~~~~~~~
greatest element =9
~~~~~~~~~~
 */
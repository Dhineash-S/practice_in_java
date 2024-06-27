
import java.util.*;
public class findmaxarr {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int arr[][]= new int[a][b];
    for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
        System.out.print(arr[i]);
    }
    for(int j=0;j<b;j++){
        arr[j]=sc.nextInt();
        System.out.print(arr[j]);
    }
    int max=arr[i][j];
    for(int i=0;i<b;i++){
        for(int j=0;j<a;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
        System.out.print(max;)
    }
}    
}

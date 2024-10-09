//Rotate an Array
import java.util.*;
public class prbm_29{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		while(r>0)
		{
		    int temp=arr[a-1];
		    for(int i=a-2;i>=0;i--)
		    {
		        arr[i+1]=arr[i];
		    }
		    arr[0]=temp;
		    r--;
		}
	   System.out.print(Arrays.toString(arr));
	}
}
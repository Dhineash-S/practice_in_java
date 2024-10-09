import java.util.*;
public class prbm_30{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(a<=2)
		{
		    System.out.print(-1);
		}
		else
		{
		System.out.print(arr[a-2]);
    }
    
	}
}
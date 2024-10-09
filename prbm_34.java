import java.util.*;
public class prbm_34{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][5];
		int r=0;
		int c=0;
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<5;j++)
		    {
		        arr[i][j]=sc.nextInt();
		        if(arr[i][j]==1)
		        {
		            r=i+1;
		            c=j+1;
		        }
		    }
		}
		System.out.print(Math.abs(r-3)+Math.abs(c-3));
	}
}
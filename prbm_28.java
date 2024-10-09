import java.util.*;
public class prbm_28{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int l=1;
		for(int i=1;i<=a;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(l+" ");
		        l++;
		    }
		    System.out.println();
		}
	}
}
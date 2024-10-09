import java.util.*;
public class prbm_32{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next().toLowerCase();
		String s2=sc.next().toLowerCase();
	
		if(s1.compareTo(s2)<0)
		{
		    System.out.print(-1);
		}
		else if(s1.compareTo(s2)>0)
		{
		    System.out.print(1);
		}
		else 
		{
		    System.out.print(0);
		}
	}
}
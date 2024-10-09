import java.util.*;
public class prbm_33{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(calof(a));
	
	}   
	public static int calof(int a)
	{
	    if(a==0)
	    {
	        return 0;
	    }
	    else if(a==1||a==2)
	    {
	        return 1;
	    }
	    else
	    {
	        return calof(a-1)+calof(a-2)+calof(a-3);
	    }
	}
}
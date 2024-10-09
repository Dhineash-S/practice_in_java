import java.util.*;
public class prbm_26 {
	public static void main(String[] args)
	{
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print(calof(a));
	}
	public static int calof(int a)
	{
	    if(a<=1)
	    {
	        return 1;
	    }
	    int a1=1;int b=1;
	    int ways=0;
	    for(int i=2;i<=a;i++)
	    {
	        ways=a1+b;
	        a1=b;
	        b=ways;
	    }
	    return ways;
	    
	}
}

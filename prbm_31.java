//Sum of the digits
    import java.util.*;
    public class prbm_31{
	public static void main(String[] args){
		//write your code here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=Integer.toBinaryString(a);
		String s[]=str.split("");
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		    int x=Integer.parseInt(s[i]);
		    sum=sum+x;
		}
		System.out.print(sum);
	}
}
		
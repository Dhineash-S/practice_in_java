
import java.util.*;
public class fibo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.print(fib(n));
	}
	public static int fib (int n) {
	    if(n==0 || n==1)
	      return n;
	    return fib(n-1)+fib(n-2);
	}
}
// output
// 15
// 610
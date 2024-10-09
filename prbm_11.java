// island
import java.util.*;
public class prbm_11{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int e=x.nextInt();
		int d=x.nextInt();
		int tr=e*d;
		int sd=d/7;
		int min=(tr+n-1)/n;
		d=d-sd;
		if(min>d){
		    System.out.print(-1);
		}
		else{
		    System.out.print(min);
		}
	}
}


import java.util.*;
public class prbm_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//	1.Without giving arr length add the even numbers in array
		String str = sc.nextLine();
		String s[] = str.split(" ");
		int n = s.length;
		int sum=0;
		for(int i=0;i<n;i++){
		    int m = Integer.parseInt(s[i]);
		    if(m%2==0){
		        sum=sum+m;
		    }
		}
		System.out.println(sum);
    }
}
// output:
// 1 2 3 4 5
// 6

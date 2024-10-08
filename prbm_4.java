import java.util.*;
public class prbm_4 {
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       	// 4. convert integer to binary and add all the binary values
		int n = x.nextInt();
		int sum=0;
		while(n>0){
		    sum=sum+(n%2);
		    n=n/2;
		}
		System.out.println(sum); 
    }
}
// output
// 32
// 1
import java.util.*;
public class prbm_3 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        	// 3. Prime number or not
		int n = x.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
		    if(n%i==0){
		        count++;
		    }
		}
		if(count==2){
		    System.out.println("1");
		}else{
		    System.out.println("0");
		}
    }
}
// output
// 0632
// 0
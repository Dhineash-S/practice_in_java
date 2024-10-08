import java.util.*;
public class prbm_5 {
    public static void main(String[] args) {
       Scanner x= new Scanner(System.in);
       
		// 5. check whether b is the next prime of a
		int a = x.nextInt();
		int b = x.nextInt();
		int count;
		for(int i=a+1;i<=b;i++){
		    count=0;
		    for(int j=1;j<=b;j++){
		        if(i%j==0){
		            count++;
		        }
		    }
		    if(count==2){
		        if(b==i){
		            System.out.println("True");
		            break;
		        }else{
		            System.out.println("False");
		            break;
		        }
		    }
		} 
    }
}
// output
// 11
// 13
// True
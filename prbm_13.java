//magical num
import java.util.*;
public class prbm_13{
	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
		String bin=Integer.toBinaryString(i);
	    int	count=0;
		for(char n:bin.toCharArray()){
		    if(n=='1'){
		        count=count+2;
		    }
		    else{
		        count=count+1;
		    }
		}
		if(count%2!=0){
		    sum++;
		}
		}
		System.out.print(sum);
		
	}
}

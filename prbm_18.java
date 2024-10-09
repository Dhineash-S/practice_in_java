import java.util.*;
public class prbm_18{
	public static void main(String[] args){
		//write your code here
		Scanner x=new Scanner(System.in);
		int s=x.nextInt();
		int arr[]=new int[s];
		for(int i=0;i<s;i++){
		    arr[i]=x.nextInt();
		}
		int m=x.nextInt();
		System.out.print(funcall(arr,m,s));
	}
	public static int funcall(int arr[],int m,int s){
	    int count=0;
	    for(int i=0;i<s;i++){
	        int price=arr[i];
	        if(price%5==0){
	            count++;
	        }
	        else if (m>= price){
	            m-= price;
	            count++;
	        }
	        else{
	            break;
	        }
	    }
	    return count;
	}
}
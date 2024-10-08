import java.util.*;
public class prbm_6 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        
		// 6. return the every element in the arr is even or odd
		int n = x.nextInt();
		int arr[] = new int[n];
		String str = "";
		for(int i=0;i<n;i++){
		    arr[i]=x.nextInt();
		    if(arr[i]%2==0){
		        str=str+"Even";
		    }else{
		        str=str+"Odd";
		    }
		}
        System.out.print(str);
    }
}
// output
// 5
// 1 2 3 4 5 
// OddEvenOddEvenOdd

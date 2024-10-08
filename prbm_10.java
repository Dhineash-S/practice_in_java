import java.util.*;
public class prbm_10 {
    public static void main(String[] args) {
       Scanner x=new Scanner(System.in);
       
        // 10. count the no. of spaces in both the string and find difference and the difference is divisible by 2 it will print even+diff or else print odd+diff
        String str1 = x.nextLine();
        String str2 = x.nextLine();
        String str3[] = str1.split(" ");
        String str4[] = str2.split(" ");
        int diff = Math.abs((str3.length-1)-(str4.length-1));
        if(diff%2==0){
            System.out.println("Even "+diff);
        }else{
            System.out.println("Odd "+diff);
        }
	}
} 
//  output
//  i am dhineash
//  i am praneash
//  Even 0


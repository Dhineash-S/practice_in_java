import java.util.*;
public class prbm_2 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
		//2.Leap year or not
		int n = x.nextInt();
		if((n%4==0&&n%100!=0)||n%400==0){
		    System.out.println("1");
		}else{
		    System.out.println("0");
		}
    }
}

// output
// 2003
// 0
import java.util.*;
public class prbm_35 {
	public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int x1=sc.nextInt();
	 int y1=sc.nextInt();
	 int x2=sc.nextInt();
	 int y2=sc.nextInt();
	 if(x1==x2)
	 {
	     int s=Math.abs(y2-y1);
	     System.out.println(x1+" "+(y1+s)+" "+x2+" "+(y2+s));
	 }
	 else if(y1==y2)
	 {
	     int s=Math.abs(x2-x1);
	     System.out.println((x1+s)+" "+y1+" "+(x2+s)+" "+y2);
	 }
	 else if(Math.abs(x2-x1)==Math.abs(y2-y1)){
	     System.out.println(x1+" "+y2+" "+x2+" "+y1);
	     
	 }
	 else
	 {
	     System.out.print(-1);
	 }
	}
}
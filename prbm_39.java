import java.util.*;
public class prbm_39 {
    public static void main(String args[]){
        Scanner x= new Scanner(System.in);
        String str=x.nextLine();
        char ch[]=str.toCharArray();
        int a=0,b=0;
        for(char n:ch){
        if('a'==n){
            a++;
        }
        else if('b'==n){
            b++;
        }
        }
        System.out.print(a<b?a:b);
}
}
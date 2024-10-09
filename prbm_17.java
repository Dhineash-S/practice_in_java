///Maximum Permutation Value
import java.util.*;
public class prbm_17{
    public static void main(String arg[]){
        Scanner x= new Scanner(System.in);
        String str=x.nextLine();
        String temp=str.replaceAll("[{}]","").replaceAll(" ","").replaceAll("[aeiouAEIOU]","");
        String []arr=temp.split(",");
        int max=0;
        for(String a: arr){
            char wrd[]=a.toCharArray();
            if(max<wrd.length){
                max=wrd.length;
            }
        }
        int mul=1;
        for(int i=1;i<=max;i++){
            mul=mul*i;
        }
        System.out.print(mul);
       
    }
}

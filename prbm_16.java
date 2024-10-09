//file_1,file_3
import java.util.*;
public class prbm_16{
    public static void main(String arg[]){
        Scanner x= new Scanner(System.in);
        String str=x.nextLine();
        String temp=str.replaceAll("[{}]","").replaceAll(" ","");
        String []arr=temp.split(",");
        Arrays.sort(arr);
        // System.out.print(arr[arr.length-1]);
        String word=arr[arr.length-1];
        char ch[]=word.toCharArray();
        System.out.print(ch[ch.length-1]);
    }
}
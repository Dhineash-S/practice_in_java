import java.util.*;
public class prbm_9 {
    public static void main(String[] args) {
       Scanner x= new Scanner(System.in);
       
        // 9. print the length of longest string that not interupt by '.'
        String str = x.next();
        String str1[] = str.split("\\.");
        int max=0;
        for(int i=0;i<str1.length;i++){
            max=Math.max(max,str1[i].length());
        }
        System.out.println(max); 
    }
}
// output
// dhineash.praneash.satheesh.nirmala
// 8

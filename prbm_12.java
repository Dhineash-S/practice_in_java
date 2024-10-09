import java.util.*;
public class prbm_12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); 
        String str = x.next();
        str = str.replace("{", "").replace("}", "").trim();
        String arr[] = str.split(",");
        int num=x.nextInt();
        int count = 0;
        for (String s : arr) {
            int temp=Integer.parseInt(s);
            if(temp<0){
                count++;
                }
        }
        System.out.print(count);
    }
}
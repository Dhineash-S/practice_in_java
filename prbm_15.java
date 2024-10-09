//rhyming word
import java.util.*;
public class prbm_15{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        String or = x.next().toLowerCase();
        String chk = x.next().toLowerCase();
        char org[] = or.toCharArray();
        char tra[] = chk.toCharArray();
        int num = x.nextInt();
        int count = 0;
        for(int i = 0; i < org.length ; i++){
            if(org[org.length-1 - i] == tra[tra.length-1 - i]){
                count++;
            }
        }
        if(count==num){
            System.out.print("same word");
        }
        else if(count<=num&& count>=1){
             System.out.print("rhyming word");
        }
        else if(org.length==0||tra.length==0){
        System.out.print("no word");
        }
    }
}
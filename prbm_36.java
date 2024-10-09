import java.util.*;
public class prbm_36 {
    public static void main(String args[]){
        Scanner x= new Scanner(System.in);
        String str=x.nextLine();
        char ch[]=str.toCharArray();
        char temp[]=str.toCharArray();
        Arrays.sort(ch);
        int count=0;
        for(int i=0;i<ch.length;i++){                                                  
        
            if(ch[i]==temp[i]){
                count++;                        
            }
        }
        if(count==ch.length){
            System.out.print("true");
        }
        else{
            System.out.print("flase");
        }
    }
}
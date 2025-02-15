import java.util.*;
public class prbm_40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        for(int i=0;i<sb1.length();i++){
            for(int j=0;j<sb2.length();j++){
                if(sb1.charAt(i)==sb2.charAt(j)){
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    break;
                }
            }
        }
        System.out.print(sb1.toString() );
        System.out.print(sb2.toString() );
    }
}

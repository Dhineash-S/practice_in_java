import java.util.Scanner;

public class CompareStringWithArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String str1 = x.nextLine();
        String str2 = x.nextLine();
        char ch[] = str2.toCharArray();
        
        String res = str1;
        
        for (int i = 0; i < ch.length; i++) {
            res = res.replace(String.valueOf(ch[i]), "");
        }
        
        System.out.print(res);
        
    }
}
/*
 * output
 *  asdfghasdfgas
    as
    dfghdfg
 */
import java.util.*;
public class prbm_7 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        // 7. return max permutation count of string arr element after removing the vowels
        int n = x.nextInt();
        int max=0;
        String str[] = new String[n];
        for(int i=0;i<n;i++){
            str[i]=x.next();
        }
        for(int i=0;i<n;i++){
            String str1="";
            char ch[] = str[i].toCharArray();
            for(int j=0;j<str[i].length();j++){
                if(ch[j]=='A'||ch[j]=='E'||ch[j]=='I'||ch[j]=='O'||ch[j]=='U'||ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u'){
                    continue;
                }else{
                    str1=str1+ch[j];
                }
            }
            int m = str1.length();
            for(int j=m-1;j>0;j--){
                m=m*j;
            }
            max=Math.max(max,m);
        }
        System.out.println(max);
    }
}
// output
// 5
// a d z i o 
// 1

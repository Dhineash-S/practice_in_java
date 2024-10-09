import java.util.Scanner;

public class prbm_20 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String str = x.nextLine();
        char temp[] = str.toCharArray();
        char ch = x.next().charAt(0);
        int count = 0; 
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == ch) {
                count++;
            }
        }
        System.out.print(count);                   
    }
}
// o/p
// helloworld
// l
// 3

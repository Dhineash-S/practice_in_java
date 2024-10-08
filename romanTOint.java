import java.util.*;
public class romanTOint {
    public static String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNum = new StringBuilder();
        int i = 0;
        while (num > 0) {
            for (int j = num / val[i]; j > 0; j--) {
                romanNum.append(syb[i]);
                num -= val[i];
            }
            i++;
        }
        return romanNum.toString();
    }

    public static void main(String[] args) {
    Scanner x= new Scanner(System.in);
    int num =x.nextInt();
    System.out.print("Roman: "+intToRoman(num));
}
}
// output:
// 10
// Roman: X
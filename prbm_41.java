import java.util.*;
public class prbm_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashSet<Character> val = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!val.contains(c)) {
                val.add(c);
                for (char ch : str.toCharArray()) {
                    if (ch == c) {
                        result.append(ch);
                    }
                }
            }
        }

        System.out.println(result.toString());
    }
}
// Input 1 :
// abcaaubcc
// Output 1 :
// aaabbcccu
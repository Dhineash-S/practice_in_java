// You are using Java
import java.util.Scanner;

public class prblm_37 {
    public static int countTrailingZeros(int num) {
        int count = 0;
        while (num >= 5) {
            num /= 5;
            count += num;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
     
        System.out.println(countTrailingZeros(num));
    }
}


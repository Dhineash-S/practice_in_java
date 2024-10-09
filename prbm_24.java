import java.util.*;

public class prbm_24  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f[] = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = (f[i - 1] * f[i - 1] + f[i - 2] * f[i - 2]) % 47;
        }
        System.out.print(f[n]);
    }
}
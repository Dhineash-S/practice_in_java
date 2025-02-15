import java.util.*;

public class prbm_37
{
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        int s = x.nextInt();
        int tra = x.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = x.nextInt();
        }
        HashSet<Integer> val = new HashSet<>();
        HashSet<Integer> val2 = new HashSet<>();
        for (int i = 0; i < tra; i++) {
            val.add(arr[i]);
        }
        for (int i = tra; i < s; i++) {
            val2.add(arr[i]);
        }
        List<Integer> reverse = new ArrayList<>(val2);
        Collections.reverse(reverse);
        for (int a : val) {
            System.out.print(a + " ");
        }
        for (int a : reverse) {
            System.out.print(a + " ");
        }
    }
}
//output
    //5
    //3
    //4 9 6 1 9
    //4 6 9 9 1 
import java.util.Scanner;

public class prbm_22  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
          arr[i] = scanner.nextInt();
        }
        int sum = 0,xor=0;
        for (int i = 0; i < s; i++) {
            if(i%2!=0){
            sum += arr[i];
             }
         else{
             xor=xor^arr[i];
              }
        }
        System.out.println( sum-xor);
    }  }
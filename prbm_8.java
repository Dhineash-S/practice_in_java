import java.util.*;
public class prbm_8 {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
                // 8. after reversing array and add the even index/position value in the array
        int n = x.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        int sum=0;
        int j=n-1;
        for(int i=0;i<n;i++){
            arr[i]=x.nextInt();
            arr1[j]=arr[i];
            j--;
        }
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+arr1[i];
            }
        }
        System.out.println(sum);
    }
}
// output
// 5
// 1 3 4 6 8
// 13
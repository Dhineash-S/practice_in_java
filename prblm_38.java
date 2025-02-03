import java.util.*;
public class prblm_38 {

    public static void main(String args []){
        Scanner x= new Scanner (System.in);
        int num=x.nextInt();
        int arr[]=new int[num];
        arr[0]=1;
        arr[1]=1;
        if(num<=2){
            System.out.print(1);
        }
        else{
            for(int i=2;i<num;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.print(arr[num-1]);
    }
}


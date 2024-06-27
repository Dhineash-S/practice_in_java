// mulitplecation table getting value and range form user
import java.util.*;
public class mulit_num {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.print("enter the number");
        int a=x.nextInt();
        System.out.print("enter the range to be print ");
        int b=x.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(i+"*"+a+"="+i*a);
        }
    }
}
/*
 * output
enter the number2
enter the range to be print 10
1*2=2
2*2=4
3*2=6
4*2=8
5*2=10
6*2=12
7*2=14
8*2=16
9*2=18
10*2=20
 */
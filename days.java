// by using switch printing week days
import java.util.*;
public class days {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the int 1 to 7");
        int a =x.nextInt();
        switch (a) {
                        case 1:
            System.out.println("Monday");
                break;
                case 2:
                System.out.println("tuesday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
            default:
            System.out.println("enter the num in range of 1 to 7");
                break;
        }
    }
}
/*
output:
enter the int 1 to 7
10
enter the num in range of 1 to 7
    
enter the int 1 to 7
3
wednesday
 */
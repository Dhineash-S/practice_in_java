
    
    import java.util.*;
    public class replace_vowle {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string :");
        String str=sc.nextLine();
        String op=str.replaceAll("['AEIOUaeiou']"," ");
        System.out.println("after replaceing "+op);
      }
    }
    /*
     * output:
     * enter the string :DhineAsh
       after replaceing Dh n  sh
     */
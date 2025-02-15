import java.util.*;
public class prbm_42 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    while(s1.contains(s2)){ 
        s1 = s1.replace(s2,""); 
    }
        
    if(s1.length()==0){ 
        System.out.print("Defeat");
    } 
    else{
        System.out.print(s1);
    }
    }
}

/*Input 1 :
AbAAbcbcc
Abc
Output 1 :
Defeat
Input 2 :
AAbAbccc
Abc
Output 2 :
Ac*/
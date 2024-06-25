import java.util.*;
public class bankloan{
public static void main(String args[]){
LinkedList<String> loan=new LinkedList<>();
loan.add("aadhaar");
loan.add("pan card");
//loan.add("cibilscore");
System.out.println("list for required things to apply for loan are :"+loan);
if(loan.contains("aadhaar")&&loan.contains("pan card")&&loan.contains("cibilscore")){
    System.out.println("you are eligible");
}
else{
    System.out.println("you are not eligible ");
}
}
}
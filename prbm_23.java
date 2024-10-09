import java.util.*;
public class prbm_23 {
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int s=x.nextInt(); nt();
int arr[]=new int[s];
for(int i=0;i<s;i++){
arr[i]=x.nextInt();
}
int max=0,a=0,b=0;
for(int i=0;i<s-1;i++){
if(arr[i]+arr[i+1]==18){
int mul=arr[i]*arr[i+1];
if (mul>max){ max=mul; a=arr[i]; b=arr[i+1]; }}}
if(a>b){
System.out.println("["+a+","+b+"]");
}else{
System.out.println("["+b+","+a+"]");
}}}

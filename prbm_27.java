import java.util.*;
public class prbm_27
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character, Integer>hm=new HashMap<>();
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        for(char c:arr)
        {
            if(hm.containsKey(c))
            {
                hm.put(c,hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
        }
        for(char k:hm.keySet())
        {
            if(hm.get(k)==2)
            {
                System.out.print(k);
                return;
            }
        }
        
    }
}

import java.util.Random;

class random_val
{
    static Random ran = new Random();

    static int a = 6;
    static int b = 6;
    
    static int gen() {
    int lope = ran.nextInt(a);
       // lope = lope++;
        if (lope == 0) {
        
        return gen();
        }
    return lope;
    }
   
    public static void main(String args[]) {
     
    int first = gen();
    int second = gen();
    
    int total = first + second;
 
    System.out.println("Result");
    System.out.println("  1st :"+first);
    System.out.println("  2nd :"+second);
    System.out.println(" total:"+total);
     
    }
}
/*
 * output
 *  Result
      1st :5
      2nd :2
     total:7
 */
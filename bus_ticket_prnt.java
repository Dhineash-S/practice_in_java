import java.util.Scanner;

public class bus_ticket_prnt{
    public static void main(String[] args) {
        System.out.println("   \t\t\t\t\t\t\t\t\tLeepak bus serives");
        
        System.out.println("\t\t\t\t\t\t\t\tstage1: kgm busstand");
        System.out.println("\t\t\t\t\t\t\t\tstage2: chennimali ");
        System.out.println("\t\t\t\t\t\t\t\tstage3: erode ");
        System.out.println("\t\t\t\t\t\t\t\tstage4:  perundurai");
        System.out.println("\t\t\t\t\t\t\t\tstage5: salem");
        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner reader = new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t\t~ stage from :");
        int a = reader.nextInt();

        switch (a) {
            case 1:
                System.out.println("\t\t\t\t\t\t\t\t\t\t~kgm busstand");
                Scanner reader2 = new Scanner(System.in); 
                System.out.print("t\t\t\t\t\t\t\t\t~ stage  to  :");
                int x = reader2.nextInt(); 
                switch (x) {
                    case 2:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t~to chennimali");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int b = reader2.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount  :" + b * 10);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                        break;
                         
               
                   case 3:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t~to erode");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int c= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + c * 20);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                  
               
                    case 4:
                        System.out.println("\t\t\t\t\t\t\t\t~to perundurai");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int d= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + d* 30);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                   
               
                    case 5:
                        System.out.println("\t\t\t\t\t\t\t\t~to salem");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int e= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + e* 40);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;

                }
                break;
                    case 2:
                System.out.println("\t\t\t\t\t\t\t\t~chennimali");

                Scanner reader3 = new Scanner(System.in); 
                System.out.print("\t\t\t\t\t\t\t\t~ stage to   :");
                int x1 = reader3.nextInt(); 
                switch (x1) {
                   case 3:
                        System.out.println("\t\t\t\t\t\t\t\t~to erode");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int c= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + c * 10);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                  
               
                    case 4:
                        System.out.println("\t\t\t\t\t\t\t\t~to perundurai");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int d= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + d* 20);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                   
               
                    case 5:
                        System.out.println("\t\t\t\t\t\t\t\t~to salem");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int e= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + e* 30);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;

                }
                break;
                
                case 3:
                System.out.println("\t\t\t\t\t\t\t\t~erode");

                Scanner reader4 = new Scanner(System.in); 
                System.out.print("t\t\t\t\t\t\t\t~ stage to  ");
                int x2 = reader4.nextInt(); 
                switch (x2) {

                    case 4:
                        System.out.println("\t\t\t\t\t\t\t\t~to perundurai");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int d= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + d* 10);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;
                   
               
                    case 5:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t~to salem");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int e= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + e* 20);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;

                }
                break;
                case 4:
                System.out.println("\t\t\t\t\t\t\t\t~perundurai");

                Scanner reader5= new Scanner(System.in); 
                System.out.print("t\t\t\t\t\t\t\t\t\t~ stage to  ");
                int x3 = reader5.nextInt(); 
                switch (x3) {

                  case 5:
                        System.out.println("\t\t\t\t\t\t\t\t\t\t~to salem");

                        System.out.print("\t\t\t\t\t\t\t\t~num of ticket :");

                        int e= reader.nextInt(); 
                        System.out.println("\t\t\t\t\t\t\t\t~total amount :" + e* 10);
                        System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        break;

                }
                break;
              
        }
    }
}

// output
// sndp bus serives
// stage1: kgm busstand
// stage2: chennimali  
// stage3: erode       
// stage4:  perundurai 
// stage5: salem       
// stage from 1
// kgm busstand
//  stage to  3
// to erode
// num of ticket :2
// total amount :40



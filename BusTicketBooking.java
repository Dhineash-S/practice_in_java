import java.util.*;
public class BusTicketBooking {

    private static final int TOTAL_SEATS = 50; 
    private static int availableSeats = TOTAL_SEATS;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
            System.out.println("\t\t\t\t\t\t\t\t\tLeepak bus service");
            
        do {
            System.out.println("\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\t\t\t\tBus Ticket Booking System");
            System.out.println("\t\t\t\t\t\t\t\t1. Book a Ticket");
            System.out.println("\t\t\t\t\t\t\t\t2. View Available Seats");
            System.out.println("\t\t\t\t\t\t\t\t3. Exit");
            System.out.print("\t\t\t\t\t\t\tEnter your choice (1-3) : ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    bookTicket();
                    break;
                case 2:
                    viewAvailableSeats();
                    break;
                case 3:
                    System.out.println("\t\t\t\t\t\t\t\t      ~~~~~~~Exiting~~~~~~~");
                    break;
                default:
                    System.out.println("\t\t\t\t\txxxxxxxxxxxxxxxx-Invalid choice! Please select a valid option-xxxxxxxxxxxxxxx");
            }
        } while (choice != 3);

    }

    private static void bookTicket() {
        if (availableSeats > 0) {
            Scanner sc=new Scanner(System.in);
            System.out.print("\n\t\t\t\t\t\t\tEnter your location    :");
            String loc=sc.nextLine();
            System.out.print("\n\t\t\t\t\t\t\tEnter your destination :");
            String des=sc.nextLine();
            System.out.print("\n\t\t\t\t\t\t\tEnter number of ticket :");
            int count =sc.nextInt();
            System.out.println("\n\t\t\t\t\t\t\t\tTicket booked successfully!");
            System.out.println("\n\t\t\t\t\t\t\t\t"+loc+"  TO  "+des);
            availableSeats= availableSeats-count;
            System.out.println("\t\t\t\t\t\t\t\t\tRemaining seats: " + availableSeats);
        } else {
            System.out.println("Sorry, no seats available.");
            System.out.println("t\t\t\t\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    private static void viewAvailableSeats() {
        System.out.println("\t\t\t\t\t\t\t\t\tAvailable seats: " + availableSeats);
    }


    }
    

    // output:
    //            Leepak bus service
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //         Bus Ticket Booking System
    //         1. Book a Ticket
    //         2. View Available Seats
    //         3. Exit
    // Enter your choice (1-3) : 2
    //                 Available seats: 50
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //         Bus Ticket Booking System
    //         1. Book a Ticket
    //         2. View Available Seats
    //         3. Exit
    // Enter your choice (1-3) : 1

    // Enter your location    :kayagam

    // Enter your destination :cbr

    // Enter number of ticket :1

    //         Ticket booked successfully!

    //         kayagam  TO  cbr
    //                 Remaining seats: 49
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //         Bus Ticket Booking System
    //         1. Book a Ticket
    //         2. View Available Seats
    //         3. Exit
    // Enter your choice (1-3) : 2
    //                 Available seats: 49
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //         Bus Ticket Booking System
    //         1. Book a Ticket
    //         2. View Available Seats
    //         3. Exit
    // Enter your choice (1-3) : 3
    //               ~~~~~~~Exiting~~~~~~~

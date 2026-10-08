import java.util.Scanner;
import java.text.DecimalFormat;

class MovieTicket {
     private String movieName;
private double ticketPrice;
private int numberOfTickets;

 // Parameterized constructor
 public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
 this.movieName = movieName;
 this.ticketPrice = ticketPrice;
 this.numberOfTickets = numberOfTickets;
 }

 // Calculate total ticket amount
public double calculateTotal() {
 return ticketPrice * numberOfTickets;
 }

 // Calculate discount (10% if tickets >= 5)
 public double calculateDiscount(double total) {
 if (numberOfTickets >= 5) { return total * 0.10;
 } else {
 return 0;
 }
 }

 // Calculate final amount after discount
 public double calculateFinalAmount(double total, double discount) { return total - discount;
 }

 // Display bill
 public void displayBill(double total, double discount, double finalAmount) {
 DecimalFormat df = new DecimalFormat("0.00");
 System.out.println("\n--- Cinema Ticket Booking Bill ---");
  System.out.println("Movie Name: " + movieName);
   System.out.println("Ticket Price: Rs. " + df.format(ticketPrice));
 System.out.println("Number of Tickets: " + numberOfTickets);
 System.out.println("Total Amount: Rs. " + df.format(total));
 System.out.println("Discount: Rs. " + df.format(discount));
 System.out.println("Final Amount: Rs. " + df.format(finalAmount));
 }
}

public class CinemaTicketBooking {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 // Read input values
 System.out.print("Enter Movie Name: ");
String movieName = sc.nextLine();
 System.out.print("Enter Ticket Price: ");
 double ticketPrice = sc.nextDouble();

 System.out.print("Enter Number of Tickets: ");
 int numberOfTickets = sc.nextInt();

 // Create MovieTicket object
 MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

 // Perform calculations
  double total = ticket.calculateTotal();
 double discount = ticket.calculateDiscount(total);
 double finalAmount = ticket.calculateFinalAmount(total, discount);

 // Display bill
 ticket.displayBill(total, discount, finalAmount);

 sc.close();
 }
}
package Blocks;

public class MovieTicketsMain {
	  public static void main(String[] args) {

	        MovieTickets ticket = new MovieTickets();

	        ticket.setMovieName("Avengers");
	        ticket.setCustomerName("Kushal");
	        ticket.setTicketCount(2);
	        ticket.setTicketPrice(150.0);

	        System.out.println("Movie Name : " + ticket.getMovieName());
	        System.out.println("Customer Name : " + ticket.getCustomerName());
	        System.out.println("Ticket Count : " + ticket.getTicketCount());
	        System.out.println("Ticket Price : " + ticket.getTicketPrice());

	        double total = ticket.getTicketCount() * ticket.getTicketPrice();
	        System.out.println("Total Amount : " + total);
	    }

}

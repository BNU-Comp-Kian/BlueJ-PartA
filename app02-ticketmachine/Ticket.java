import java.util.Date;
/**
 * This class is the ticket that will stor the destination the price 
 * and the date of purchase.
 *
 * @author (Kian Rozblat)
 * @version (13/10/2020)
 */
public class Ticket
{
    // instance variables - replace the example below with your own
    private String destination;
    private int price;
    private Date date;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, int price)
    {
        // Ticket price
        this.destination = destination;
        this.price = price;
        this.date = new Date();
       
    }
    
    /**
     * 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * 
     */
    public  void print()
    {
        // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("#Destination "+ this.destination);
            System.out.println("# " + this.price + " cents.");
            System.out.println("##################");
            System.out.println(this.date);
    }
}

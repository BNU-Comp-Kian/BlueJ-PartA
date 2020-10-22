
/**
 * Write a description of class Ticket here.
 *
 * @author (Kian Rozblat)
 * @version (13/10/2020)
 */
import java.util.Date;
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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public  void printTicket()
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

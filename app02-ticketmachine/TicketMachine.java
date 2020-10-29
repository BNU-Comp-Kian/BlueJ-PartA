/**
 * @author Kian Rozblat
 * @version 13/10/2020
 * 
 * Modified by Kian Rozblat
 */

public class TicketMachine
{
    // The price of a ticket from this machine.
    public static final Ticket aylesburyTicket = new Ticket("Aylesbury", 220);
    public static final Ticket amershamTicket = new Ticket("Amersham", 300);
    public static final Ticket highWycombeTicket = new Ticket("High Wycombe", 330);
    
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket userTicket;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
        userTicket = null;
    }


    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public void printBalance()
    {
          System.out.println("your balance is " + balance);
    }
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
            printBalance();
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    /**
     * If enough money is inserted print a ticket and reduce balance by price of ticket
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        int price = userTicket.getPrice();
        
        if(balance >= price) 
        {
            total = total + price;
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
        }
    }
    
    public void insertCoin(Coin coin)
    {
        System.out.println(coin.getPrice() + "p Inserted");
        balance = balance + coin.getPrice();
        printBalance();
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void selectAylesbury()
    {
        userTicket = aylesburyTicket;
    }
    
    public void selectAmersham()
    {
        userTicket = amershamTicket;
    }
    
    public void selectHighWycombe()
    {
        userTicket = highWycombeTicket;
    }
    
    public void print()
    {
     if(balance >= userTicket.getPrice())
     {
         userTicket.print();
         balance = balance - userTicket.getPrice();
         printBalance();
     }
    }

    
}


 
        
    
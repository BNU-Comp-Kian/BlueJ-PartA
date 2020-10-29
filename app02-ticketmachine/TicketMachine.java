/**
 * TicketMachine is a model of a normal ticket machine that will print tickets to 3 seperate destinations
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
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
    // the price of the ticket
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket userTicket;
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost)
    {
        price = 0;
        balance = 0;
        total = 0;
        
        userTicket = null;
    }

    /**
     *this will show the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
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
        if(balance >= price) 
        {
            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
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
        if (coin.getPrice() == 10){
            System.out.println("10p Inserted");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 20){
            System.out.println("20p Inserted");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 100){
            System.out.println("£1.00 Inserted");
            balance = balance + coin.getPrice();
        }
        else if (coin.getPrice() == 200){
            System.out.println("£2.00 Inserted");
            balance = balance + coin.getPrice();
        }
        System.out.println("your balance is " + balance);
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
         userTicket.getPrice();
         balance = balance - userTicket.getPrice();
     }
    }

    
}


 
        
    
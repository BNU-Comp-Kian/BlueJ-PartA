/**
 * Model some details of a product sold by a company.
 * 
 * @author Kian Rozblat.
 * @version 01/11/20
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * this returns the id of the product
     */
    public int getID()
    {
        return id;
    }

    /**
     * this returns the name of the product
     */
    public String getName()
    {
        return name;
    }

    /**
     * returns the quantity of the stock
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * adds the the quantity of the stock
     */
    public void deliver(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sell one of the products.
     * With an error is reported if there appears to be no stock.
     */
    public void sellOne()
    {
        if(quantity > 0) 
        {
            quantity--;
        }
        else 
        {
            System.out.println(
                "Attempt to sell an out of stock item: " + name);
        }
    }
    
    /**
     * converts the information into a string
     */
    public String toString()
    {
        return id + ": " + name + " Stock Level: " + quantity;
    }
    
    /**
     * Renames the product from id
     */
    public void renameProduct(String name)
    {
        this.name = name;
    }
}

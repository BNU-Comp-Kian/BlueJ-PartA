import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Kian Rozblat) 
 * @version (01/11/20)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**Sells a product in the list
     * 
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            if(quantity > product.getQuantity())
                quantity = product.getQuantity();
            printProduct(id);
            
            for(int count = 0; count <= quantity; count++)
            {
                product.sellOne();
            }
        
        printProduct(id);
        }
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        if(product != null)
            product.deliver(amount);
        else
            System.out.println("Invalid Product ID = " + id);
    }
    
    /**
     * Try to find a product in the stock with the given id.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of all the products.
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Rozblat's List of Stock");
        System.out.println("========================");
        System.out.println();
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
        
        System.out.println();
    }
    
    /**
     * 
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            System.out.println(product.toString());
        }
    }
}

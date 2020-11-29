import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Kian Rozblat
 * @version 19/11/20
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
    
    private Random randomGenerator;
    
    /**
     * This creates a StockManager and will populate it with 10 
     * sample products. and also includes a random number generator 
     * to be used in deliveries
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        randomGenerator = new Random();
        
        manager.addProduct(new Product(101, "Samsung Galazy Z Fold 2 5G"));
        manager.addProduct(new Product(102, "Samsung Galaxy Note 20"));
        manager.addProduct(new Product(103, "Apple iPhone 12"));
        manager.addProduct(new Product(104, "Samsung Galaxy S20"));
        manager.addProduct(new Product(105, "Google Pixel 5"));
        manager.addProduct(new Product(106, "OnePlus 8T"));
        manager.addProduct(new Product(107, "LG V60 ThinQ 5G"));
        manager.addProduct(new Product(108, "Samsung Galaxy S11 FE"));
        manager.addProduct(new Product(109, "Sony Xperia 1 II"));
        manager.addProduct(new Product(110, "Samsung Galaxy Note 10 Plus"));
    }
    
    /**
     * this method will run all the testing which is needed to 
     * demonstrate the requirements
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demo.sellProducts();
        manager.printAllProducts();
        manager.getLowStock();
    }
    
    /**
     * This will do a delivery as long as the ID number is 
     */
    private void demoDeliverProducts()
    { 
        int quantity = 0;
        
        for(int id = 101; id <110; id++)
        {
            quantity = randomGenerator.nextInt(10) + 1 ;
            manager.deliverProduct(id,quantity);  
        }   
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    private void sellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++) 
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProduct(id,quantity);
        }
    }
    
    /**
     * Show details of the given product. If found from id
     */
    public void showDetails(int id)
    {
        Product product = getProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
    
}

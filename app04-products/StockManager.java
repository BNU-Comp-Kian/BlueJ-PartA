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
    private String newProductName;
    
    /**
     * Starts the stock manager.
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
     * using the ID it would show the number in stock
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
    
    /**this prints out the products from the id
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
    
    /**
     * allows the mnager to delete the product based on ID
     */
    public void deleteProduct(int id)
    {
        Product product = findProduct(id);
        {
                if(product != null)
                {
                    this.stock.remove(product);
                    System.out.print("You have deleted " + product);
                }
        }
    }
    
    /**
     * this renames the product based on the ID
     */
    public void renameProduct(int id,String newName)
    {
        Product product = findProduct(id);
        {
                String oldName = product.getName();
                product.renameProduct(newName);

                if(oldName != product.getName())
                {
                    System.out.println("You have successfully renamed "+ oldName+ " to " + product.getName());
                }

        }
    }
    
    /**this prints all the products with stock less than 3
     * 
     */
    public ArrayList<Product> getLowStock() 
    {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product product : stock) {
            if(product.getQuantity() <= 3)
            {
                System.out.println("The following products are low in stock " + product);
            }
        }
        return result;
    }
}

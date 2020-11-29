/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Kian Rozblat.
 * @version 19/11/20
 */
public class StockApp
{
    public final String ADD = "add";

    public final int FIRST_ID = 101;
    
    // Use to get user input
    private InputReader input;
    private StockManager manager;
    private StockDemo demo;
    private Product product;
    
    private int nextID = FIRST_ID;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * this method runs the program
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            executeMenuChoice(choice);
            if(choice.equals(ADD))
                finished = true;
        }
    }

    /**
     * executes the chosen menu choice
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }

        else if(choice.equals("remove"))
        {
            removeProduct();   
        }

        else if(choice.equals("printall"))
        {
            printAllProducts();   
        }

        else if(choice.equals("rename"))
        {
            renameProduct();   
        }

        else if(choice.equals("deliver"))
        {
            deliverProduct();   
        }

        else if(choice.equals("search"))
        {
            searchProduct();   
        }

        else if(choice.equals("low-stock"))
        {
            lowStock();   
        }

        else if(choice.equals("restock"))
        {
            restock();   
        }

        else if(choice.equals("search"))
        {
            sellProduct();   
        }
    }
    
    /**
     * will deliver the product to add to the stock
     */
    public void deliverProduct()
    {
        System.out.println("Deliver a Product");
        System.out.println();

        int id = input.getInt("Enter product ID \n");

        int amount = input.getInt("enter amount \n");

        demo.addProducts(id,amount);

        System.out.println("the following product has been sold " + id);
    }

    /**
     * will search for a product based on the name
     */
    public void searchProduct()
    {
     System.out.println("Enter name of product ");
     String word = input.getInput();
     
     manager.searchByName(word);
    }
    
    /**
     * print all the low stock items
     */
    public void lowstock()
    {
        System.out.println("The following products have 3 or less in stock");
        manager.getLowStockLevel(0);
    }

    /**
     * restocks the items with stock less than 3 with a selected amount
     */
    public void restock()
    {
        System.out.println("Products less than 3 will be restocked");
        int restock = input.getInt("Enter amount to restock");
        manager.getLowStockLevel(restock);
    }

    /**
     * add a product into the list
     */
    public void addProduct()
    {
        System.out.println("Add a new product");
        System.out.println();

        System.out.println();
        String value = input.getInput();
        int id = Integer.parseInt(value);

        System.out.print("Enter product name");
        String name = input.getInput();

        Product product = new Product(id, name);
        manager.addProduct(product);
    }

    /**
     * remove a product from the list
     */
    public void removeProduct()
    {
       System.out.println("Remove a Product ");
       System.out.println();

       System.out.println("Enter the product ID ");
       String number = input.getInput();

       int id = Integer.parseInt(number);

       manager.deleteProduct(id);

       System.out.println("the following product has been deleted " + id);

    }
    
    /**
     * sells a product
     */
    private void sellProduct()
    {
        System.out.println("Sell a Product");
        System.out.println();
     
        int id = input.getInt("Enter the Product ID \n");
     
        int amount = input.getInt("Enter amount to sell");
     
        demo.sellProduct(id,amount);
     
        System.out.println("The Following product has been sold "+ od);
    }
    
    /**
     * print all the low stock items
     */
    public void lowStock ()
    {
        System.out.println();
        manager.getLowStock(0);
    }
    
    /**
     * renames the product
     */
    public void renameProduct()
    {
     manager.renameProduct();  
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Sell:        Add a new product");
        System.out.println("    Deliver:     Remove an old product");
        System.out.println("    Search:   Print all products");
        System.out.println("    Low-Stock:       Quit the program");
        System.out.println("    Re-Stock:        Add a new product");
        System.out.println("    Rename:     Remove an old product");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Kian Rozblat");
        System.out.println("******************************");
    }

    /**
     * print all the products in a list
     */
    public void printAllProducts()
    {
        manager.printAllProducts();
    }
}

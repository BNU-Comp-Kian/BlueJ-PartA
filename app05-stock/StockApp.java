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

    // User input
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

            String choice = input.getInput("Please enter choice");
            choice = choice.toLowerCase();

            
            if(choice.equals("quit"))
                finished = true;
            else
                executeMenuChoice(choice);
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

        manager.deliverProduct(id, amount);// the main error

        System.out.println("the following product has been delivered " + id);
    }

    /**
     * will search for a product based on the name
     */
    public void searchProduct()
    {
        String word = input.getInput("Enter name of product ");

        manager.searchByName(word);
    }

    /**
     * print all the low stock items
     */
    public void lowstock()
    {
        System.out.println("The following products have 3 or less in stock");
        manager.getLowStock(0);
    }

    /**
     * restocks the items with stock less than 3 with a selected amount
     */
    public void restock()
    {
        System.out.println("Products less than 3 will be restocked");
        int restock = input.getInt("Enter amount to restock");
        manager.getLowStock(restock);
    }

    /**
     * add a product into the list
     */
    public void addProduct()
    {
        System.out.println("Add a new product");
        System.out.println();

        String value = input.getInput("Please enter product ID");
        int id = Integer.parseInt(value);// this gets highlighted with error when add product fails

        String name = input.getInput("Enter product name \n");

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

        String number = input.getInput("Enter the product ID ");

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

        System.out.println("The Following product has been sold "+ id);
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
     * renames the chosen product
     */
    public void renameProduct()
    {
        String name = "";
        System.out.println("Rename a Product ");
        System.out.println();

        int id = input.getInt("Enter the product ID ");
        
        boolean isValid = false;
        while(isValid == false)
        {
            name = input.getInput("Enter product new name");
            if (name.isBlank())
                System.out.println("Name is blank");
            else 
                isValid = true;
        }
        
        manager.renameProduct(id,name);

        System.out.println("the following product has been renamed to " + name);

    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove a specific product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Low-Stock:  Print all low stock");
        System.out.println("    Re-Stock:   Re-stock low stock product");
        System.out.println("    Rename:     Rename a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Deliver:    Remove an old product");
        System.out.println("    Search:     Search for specific product");
        System.out.println("    Quit:       Quit the program");
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

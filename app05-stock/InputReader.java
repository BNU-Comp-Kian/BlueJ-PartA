import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 *@author Kian Rozblat.
 * @version 19/11/20
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read the text inputted by the user and return it as a String.
     */
    public String getInput(String prompt)
    {
        System.out.print(prompt);         // print prompt
        String inputLine = reader.nextLine();
        
        return inputLine;
    }
    
    /**
     * Gets an integer
     */
    public int getInt(String prompt)
    {
     System.out.println(prompt);
     int number = reader.nextInt();
     
     return number;
    }
}

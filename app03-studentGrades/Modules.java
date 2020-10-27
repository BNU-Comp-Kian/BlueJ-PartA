import java.util.*;
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Modules
{
    // instance variables - replace the example below with your own
    private String title;

    private String moduleCode;

    private int mark;

    private boolean complete;

    /**
     * Constructor for objects of class Module
     */
    public Modules(String title, String moduleCode)
    {
        // setting all modules
        this.title = title;
        this.moduleCode = moduleCode;
        mark=0;
        complete = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void mark(int mark)
    {
        if((mark >= 0) && (mark <=100))
        {
            this.mark=mark;
            if(mark >= 40)complete = true;
        }
        else
        {
            System.out.print("Mark invalid");
        }
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getModuleCode()
    {
        return this.moduleCode;
    }
    
    public void setModuleCode(String moduleCode)
    {
        this.moduleCode = moduleCode;
    }
    
    public int getMark()
    {
        return this.mark;
    }

    public void setMark(int mark)
    {
        this.mark = mark;
    }

    public boolean isComplete()
    {
        return this.complete;
    }

    public void setComplete(boolean complete)
    {
        this.complete = complete;
    }
}

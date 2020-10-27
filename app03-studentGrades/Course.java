
/**
 * Class of the overall course which will print details about modules.
 *
 * @author (Kian Rozblat)
 * @version (24/10/2020)
 */
public class Course
{
    // Static grades 
    public static final int F = 0-39;
    public static final int D = 40-49;
    public static final int C = 50-59;
    public static final int B = 60-69;
    public static final int A = 70-100;
    //this will make sure the maximum modules are 4
    public static final int Max_modules = 4;
    //gives the course name and number as a class
    private String course ;
    private String courseNumber;
    
    //this is the module marking and the final mark and also the grade
    private int modulesAmount;
    private int finalCredit;
    private int finalMark;
    private int meanMark;
    private Grades finalGrade;
    //to see if the course is completed
    private boolean complete;
    //all 4 modules
    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String courseNumber, String course)
    {
        // initialise instance variables
        this.course = course;
        this.courseNumber = courseNumber;
        //sets everything to zero as nothing has been done or completed yet
        modulesAmount = 0;
        finalMark = 0;
        finalCredit = 0;
        complete = false;
    }

    /**
     * Adding the modules to the course
     */
    public void addModules(int number,Module module)
    {
        // put your code here
        if((number >= 1) && (number <= Max_modules)) modulesAmount++;
        
        switch(number)
        {
            case 1:module1 = module;break;
            case 2:module2 = module;break;
            case 3:module3 = module;break;
            case 4:module4 = module;break;
        }
    }
    
    /*
     * printing out the course details
     */
    public void print()
    {
        System.out.println("Course "+ courseNumber + " - " + course);
        System.out.println();
    }
}


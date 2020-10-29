
/**
 * Write a description of class Course here.
 *
 * @author (kian Rozblat)
 * @version (29/10/2020)
 */
public class Course
{
    
    private String courseCode;
    
    private String courseName;

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseNumber)
    {
        // initialise instance variables
         this.courseCode = courseCode;
         this.courseName = courseName;
    }

    /**
     * this will return the course code
     */
    public String getCodeNumber()
    {
        // put your code here
        return courseCode;
    }
    
    /**
     * this will return the name of the course
     */
    public String getCourseName()
    {
        return courseName;
    }
    
    /**
     * this will print the details of the course
     */
    public void print()
    {
        System.out.println("course = " + courseCode + " Course name = " + courseName);
    }
}

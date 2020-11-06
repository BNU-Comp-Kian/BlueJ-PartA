
/**
 * Class of the overall course which will print details about modules.
 *
 * @author (Kian Rozblat)
 * @version (24/10/2020)
 */
public class Course
{
    //this will make sure the maximum modules are 4
    public static final int Max_modules = 4;
    //gives the course name and number as a class
    private String course ;
    private String courseNumber;

    //this is the module marking and the final mark and also the grade
    private int modulesAmount;
    
    private int finalCredit;
    private int finalMark;
    private int calculateMark;
    private int total;
    
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
        
        createModules();
    }

    public void createModules()
    {
        module1 = new Module("Programming Concepts", "CO452");
        module2 = new Module("Web Development", "CO456");
        module3 = new Module("Computer Architecture", "CO450");
        module4 = new Module("Digital Technologies", "CO452");
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

    /**
     * this will calulate all the marks from the modules and work out the 
     * average
     */
    public void calculateMark()
    {
        total = module1.getMark() + module2.getMark() + module3.getMark() + module4.getMark();
        finalMark = total / 4;
    }
    
    public void calculateGrade()
    {
        if((finalMark >= 40) && (finalMark < 50))
            finalGrade = Grades.D;
            
        else if((finalMark >= 50) && (finalMark < 60))
            finalGrade = Grades.C;
            
        else if((finalMark >=60) && (finalMark <70))
            finalGrade = Grades.B;
            
        else if((finalMark >=70) && (finalMark <=100))
            finalGrade = Grades.A;

        System.out.println("congratulations you've passed with the grade " + finalGrade);

        if((finalMark >= 0) && (finalMark <= 39))
            System.out.println("Unfortunately you failed");
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


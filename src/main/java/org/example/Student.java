package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Student{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String name;
    char grade;
    float gpa;

    Student(String name,char grade,float gpa)
    {
        this.name=name;
        this.grade=grade;
        this.gpa=gpa;
    }
    public void updategpa(char grade)
    {
        this.grade=grade;
        if(this.grade=='D')
        {
            gpa=6;
        }
        else if(this.grade=='C')
        {
            gpa=7;
        }
        else if(this.grade=='B')
        {
            gpa=8;
        }
        else if(this.grade=='A')
        {
            gpa=9;
        }
        else if(this.grade=='O')
        {
            gpa=10;
        }
    }
    public String studentdetails()
    {
        return this.name+" has a "+this.gpa+" GPA";
    }
    public static void main(String[] args)
    {
        String name;
        char grade;
        float gpa;
        char upgrade;
        String result;
        Scanner sc=new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the Name: ");
        name=sc.nextLine();
        LOGGER.log(Level.INFO,"Enter the Grade: ");
        grade=sc.next().charAt(0);
        LOGGER.log(Level.INFO,"Enter the GPA: ");
        gpa=sc.nextFloat();
        Student s=new Student(name,grade,gpa);
        while(true)
        {
                LOGGER.log(Level.INFO, "\n1)Update GPA \n2)Student details \n3)exit");
                LOGGER.log(Level.INFO, "Student choose any one the option in the above ");
                int select = sc.nextInt();
                if (select == 1) {
                    LOGGER.info("Enter your latest grade: ");
                    upgrade = sc.next().charAt(0);
                    s.updategpa(upgrade);
                } else if (select == 2) {
                    result=""+s.studentdetails();
                    LOGGER.info(result);
                } else if (select == 3) {
                    break;
            }
        }
    }
}

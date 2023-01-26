package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Student {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String name;
    char grade;
    float gpa;

    Student(String name,char grade,float gpa)
    {
        this.name=name;
        this.grade=grade
        this.gpa=gpa;
    }
    public void updategpa(float gpa)
    {
        this.gpa=gpa;
        if(gpa==6)
        {
            grade='D';
        }
        else if(gpa==7)
        {
            grade='C';
        }
        else if(gpa==8)
        {
            grade='B';
        }
        else if(gpa==9)
        {
            grade='A';
        }
        else if(gpa==10)
        {
            grade='O';
        }
    }
    public float studentgpa()
    {
        return gpa;
    }
    public static void main(String[] args)
    {
        String name;
        char grade;
        float gpa;
        float upgpa;
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
            LOGGER.log(Level.INFO,"\n1)Update GPA \n2)Student details \n3)exit");
            LOGGER.log(Level.INFO,"Student choose any one the option in the above ");
            int select=sc.nextInt();
            if(select==1)
            {
                LOGGER.log(Level.INFO,"Enter your latest GPA: ");
                upgpa=sc.nextFloat();
                s.updategpa(upgpa);
            }
            else if(select==2)
            {
                LOGGER.log(Level.INFO,s.name+" has a ");
                LOGGER.log(Level.INFO,Float.toString(s.studentgpa()),s.studentgpa());
            }
            else if(select==3)
            {
                break;
            }
        }
    }
}

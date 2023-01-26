package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Student {
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String Name;
    char Grade;
    float GPA;

    Student(String Name,char Grade,float GPA)
    {
        this.Name=Name;
        this.Grade=Grade;
        this.GPA=GPA;
    }
    public void updategpa(float GPA)
    {
        this.GPA=GPA;
        if(GPA==6)
        {
            Grade='D';
        }
        else if(GPA==7)
        {
            Grade='C';
        }
        else if(GPA==8)
        {
            Grade='B';
        }
        else if(GPA==9)
        {
            Grade='A';
        }
        else if(GPA==10)
        {
            Grade='O';
        }
    }
    public float studentgpa()
    {
        return GPA;
    }
    public static void main(String[] args)
    {
        String Name;
        char Grade;
        float GPA;
        float upGPA;
        Scanner sc=new Scanner(System.in);
        LOGGER.log(Level.INFO,"Enter the Name: ");
        Name=sc.nextLine();
        LOGGER.log(Level.INFO,"Enter the Grade: ");
        Grade=sc.next().charAt(0);
        LOGGER.log(Level.INFO,"Enter the GPA: ");
        GPA=sc.nextFloat();
        Student s=new Student(Name,Grade,GPA);
        while(true)
        {
            LOGGER.log(Level.INFO,"\n1)Update GPA \n2)Student details \n3)exit");
            LOGGER.log(Level.INFO,"Student choose any one the option in the above ");
            int select=sc.nextInt();
            if(select==1)
            {
                LOGGER.log(Level.INFO,"Enter your latest GPA: ");
                upGPA=sc.nextFloat();
                s.updategpa(upGPA);
            }
            else if(select==2)
            {
                LOGGER.log(Level.INFO,s.Name+" has a ");
                LOGGER.log(Level.INFO,Float.toString(s.studentgpa()),s.studentgpa());
            }
            else if(select==3)
            {
                break;
            }
        }
    }
}

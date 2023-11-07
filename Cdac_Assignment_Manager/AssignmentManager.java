
package Cdac_Assignment_Manager;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Student {
    
    
    String name;
    int prnNo;

    public Student(String name, int prnNo) {
        this.name = name;
        this.prnNo = prnNo;
    }
    
    public void studInfo(){
        System.out.println("Stud name = "+name);
        System.out.println("Stud prnNo = "+prnNo);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", prnNo=" + prnNo + '}';
    }
    
    
    

    }

class Trainer{
    String name;

    public Trainer(String name) {
        this.name = name;
    }
    
    public void trainerInfo(){
        System.out.println("Trainer name= "+name);
    }

    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + '}';
    }
    
}

class Assignment{
    
    String Title="Assign-1";
    String Date;
    String Description= "Assignment Questions";
    String Assignee;
    
        Student s1 = new Student("Pallavi",123456);
        Student s2 = new Student("Aparna",123457);
        Student s3 = new Student("Dipali",123458);
        Student s4 = new Student("Sai",123459);

    
       Trainer t1 = new Trainer("Sarvat");
       Trainer t2 = new Trainer("Divender");
        
        
       
   public void title(){
        
        System.out.println(" Title is "+Title);
        
    }
    
   public void date(){
       
       Date d = new Date();
       System.out.println(d);
       
       
   }
   public void description(){
       
       System.out.println(" Description is "+Description);
   }
   public void assignee(){
       
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
       
       System.out.println(t1);
       System.out.println(t2);
       
   }

}

public class AssignmentManager {
    
    public void createAssignment(){
                    
        
        }
    
    public void addAssignmentToCollection(){
        
    }
    
    public void showAssignments(){
        

    }
    
    public void showAssignmentToFile(){
        
        
    }
    
    public void saveAssignmentToFile(){
        
    }
    
    public void loadAssignmentToFile(){
        
    }
    
    
    public static void main(String[] args) {
        
        
   
        
       
        
        
        Assignment a1 = new Assignment();
        System.out.println("**** information of all fields ***\n");
        Scanner sc1 = new Scanner(System.in);
        a1.title();
        a1.date();
        a1.description();
        a1.assignee();
        
        
        
        AssignmentManager am = new AssignmentManager();
        System.out.println("Enter your functionType");
        Scanner sc = new Scanner(System.in);
       
        
        
         int choice=sc.nextInt();
        switch(choice){
            case 1:
          
              am.createAssignment();
              break;
            
            case 2:
            
              am.addAssignmentToCollection();
              break;
            
            case 3:
            
              am.showAssignments();
              break;
            
            case 4:
            
              am.showAssignmentToFile();
              break;
            
            case 5:
            
              am.saveAssignmentToFile();
              break;
            
            case 6:
            
              am.loadAssignmentToFile();
              break;
            
            default:
                System.out.println("Invalid Entry");
              
        }
        
        
        
    }
}

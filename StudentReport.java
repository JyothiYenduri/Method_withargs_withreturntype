import java.util.*;
class Student
  {
    double stu(int sno,int Math_marks,int Phy_marks,int CS_marks,String sname)
    {
      int tot_marks;
      double avg_marks;
      tot_marks=Math_marks+Phy_marks+CS_marks;
      avg_marks=tot_marks/3;
      System.out.println("The following is the Student Report for "+sname);
      System.out.println("The Student Name is: "+sname);
      System.out.println("The Roll Number of the Student is: "+sno);
      System.out.println("Maths marks is: "+Math_marks);
      System.out.println("Physics marks is: "+Phy_marks);
      System.out.println("Computer Science marks are: "+CS_marks);
      System.out.println("Total Marks the student secured are: "+tot_marks);
      
      return avg_marks;
    }
  }
  class StudentReport
  {
    public static void main(String args[])
    {
      int sno,Math_marks,Phy_marks,CS_marks;
      String sname;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Student Roll_Number: ");
      sno=sc.nextInt();
      System.out.println("Enter Student Name: ");
      sname=sc.next();
      System.out.println("Enter Student Maths Marks: ");
      Math_marks=sc.nextInt();
      System.out.println("Enter Student Physics Marks: ");
      Phy_marks=sc.nextInt();
      System.out.println("Enter Student Computer Science Marks: ");
      CS_marks=sc.nextInt();
      Student s=new Student();
      double Avg=s.stu(sno,Math_marks,Phy_marks,CS_marks,sname);
      System.out.println("Avg Marks of the student is: "+Avg);
    }
  }
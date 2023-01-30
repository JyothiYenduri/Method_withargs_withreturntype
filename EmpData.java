import java.util.*;
class Readempdata
  {
    double edata(byte eno,String ename,double esal)
    {
     
    System.out.println("The Given Employee Number is: " +eno);
    System.out.println("The Given Employee Name is: " +ename);
    
    return esal;
    }
  }
class EmpData
  {
    public static void main(String args[])
    {
      byte eno;
      String ename;
      double esal;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter employee number as Integer: ");
      eno=sc.nextByte();
      System.out.println("Enter employee name as String: ");
      ename=sc.next();
      System.out.println("Enter employee salary as decimal value: ");
      esal=sc.nextDouble();
      Readempdata r=new Readempdata();
      double es=r.edata(eno,ename,esal);
      System.out.println("The Given Employee Salary is :"  +es);
    }
  }
import java.util.*;
class SI
{
  double simpleinterest(double p, double t, double r)
  {
      double SI,Tot_Amt;
      SI=(p*t*r)/100;
      Tot_Amt=p+SI;
      
      System.out.println("The total amount needs to repay is: "+Tot_Amt);
      return SI;
  }
      
}
class SimpleInterest
  {
    public static void main(String args[])
    {
      double p,t,r;
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter the value of principle amount in Rs.: ");
      p=sc.nextDouble();
      System.out.println("Please enter the period of time to repay in months: ");
      t=sc.nextDouble();
      System.out.println("Please enter the rate of interest applied in rupees: ");
      r=sc.nextDouble();
      SI s=new SI();
      double Si=s.simpleinterest(p,t,r);
      System.out.println("The Simple Interest is: "+Si);
    }
  }
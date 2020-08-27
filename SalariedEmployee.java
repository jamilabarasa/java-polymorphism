public class SalariedEmployee  extends Employee implements ManageWork{
    int days;
    int rate;

    public SalariedEmployee(String name,String address,int number,
     int rate,int days){
        super(name,address,number);
        this.rate = rate;
        this.days  = days;
    }

  
  public void setDays(int newDays){
      days = newDays;
  }
  
  public int getDays(){
      return days;
  }
  
  public void setRate(int newRate){
      rate = newRate;
  }
 
  public int getRate(){
    return rate;
}
  public double computepay(int days,int rate){
    double monthlySalary;
    monthlySalary = rate * days;
    System.out.println("salary for"+ getName() + "is" + monthlySalary;}  

public void mailCheck(){
   System.out.println("mailing a check to " + getNumber() + " " + "of" +
   hours + "hours " + "and " + rate + "of" + monthlySalary);
}
    
}

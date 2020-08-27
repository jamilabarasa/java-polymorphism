public class SalariedEmployee  extends Employee {
    int days;
    int rate;

    public SalariedEmployee(String name,String address,int number,
     int rate,int days){
        super(name,address,number);
    }

  
  public int setDays(int newDays){
      days = newDays;
  }
  
  public int getDays(){
      return days;
  }
  
  public int setRate(int newRate){
      rate = newRate;
  }
 
  public int getRate(){
    return rate;
}
  public double computepay(int days,int rate){
    double monthlySalary;
    monthlySalary = rate * days;
    System.out.println("salary for"+ getName() + "is" + getmonthlySalary());
}  

public void mailCheck(){
   System.out.println("mailing a check to " + this.number + " " + "of" +
   hours + "hours " + "and " + rate + "of" + monthlySalary);
}
    
}

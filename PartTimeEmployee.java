public class PartTimeEmployee extends Employee implements ManageWork{
    int hours;
    int hourlyRate;

    public PartTimeEmployee(String name,String address,int number,int hours,int hourlyRate){
        super(name,address,number);
        this.hours=hours;
        this.hourlyRate=hourlyRate;
    
    }
public double computepay(int hourlyRate,int hours){
    double salary;
    salary = hourlyRate * hours;
    System.out.println("salary for"+ getName() + "is" + salary;

}
   
   public int getHours(){
       return hours;
   }
   
   public void setHours(int newHours){
       hours = newHours;
   }
   
   public int getHourlyRate(){
       return hourlyRate;
   }
   
   public void setHourlyRate(int newHourlyRate){
       hourlyRate = newHourlyRate;
   }

public void mailCheck(){
    System.out.println("mailing a check to " + getNumber()+ " " + "of" +
    hours + "hours " + "and " + hourlyRate);
}
   


    
}
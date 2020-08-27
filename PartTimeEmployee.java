public class PartTime {
    int hours;
    int hourlyRate;

    public PartTime(String name,String address,int number,int hours,int hourlyRate){
        super(name,address,number);
        set hours(hours);
        set hourlyRate(hourlyRate);
    
    }
public double computepay(int hourlyRate,int hours){
    double salary;
    salary = hourlyRate * hours;
    System.out.println("salary for"+ getName() + "is" + salary;

}
   
   public int getHours(){
       return hours;
   }
   
   public int setHours(int newHours){
       hours = newHours;
   }
   
   public int getHourlyRate(){
       return hourlyRate;
   }
   
   public int setHourlyRate(int newHourlyRate){
       hourlyRate = newHourlyRate;
   }

public void mailCheck(){
    System.out.println("mailing a check to " + this.number + " " + "of" +
    hours + "hours " + "and " + hourlyRate);
}
   


    
}
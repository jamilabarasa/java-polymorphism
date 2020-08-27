public interface ManageWork {
    int days ;
    int hours;
    int hourlRate;
    int salary;
    int monthlySalary;
    

    public void partTimeEmployeeBonus(int bonus){
    bonus=(hours-40)*hourlRate;
 if (hours<40){
     salary = salary;
     System.out.println("Minimum hours required not attained!");
 }
 else{
      salary = salary + bonus;
      System.out.println("congratulations for the extra efforts");

 }
  
   public void salariedEmployeeBonus(int bonus2) {
       bonus2 = (days-200)*monthlySalary;

       if (days<200){
          monthlySalary = monthlySalary;
           System.out.println("Minimum days required not attained!");
       }
       else{
           monthlySalary = monthySalary + bonus2;
           System.out.println("congratulations for the extra efforts");

       }
       
   }
    
    
}
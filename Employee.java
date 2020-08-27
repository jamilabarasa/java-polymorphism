public class Employee {
    private String name;
    private String address;
    private int number;

public Employee(String name,String address,int number){
        this.name = name;
        this.address = address;
        this.number = number;
     }

public String getName(){
     return name;
 }

public void setName(String newName){
     name = newName;
 }

public String getAdress(){
    return address;
}

public void setAddress(String newAddress){
    name = newAddress;
}

public int getNumber(){
    return number;
}

public void setNumber(int newNumber){
    number = newNumber;
}

public void mailcheck(){
    System.out.println("Mailing a check to" + this.name + 
   this.address  + this.number);
}


    
}
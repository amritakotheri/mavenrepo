package abstraction;

public class FullTimeEmployee extends Employee{
	 public int calculateSalary()
	 {
	        return paymentPerHour * 8;
	    }
	    public static void main(String[] args) 
	    {
	        Contractor obj = new Contractor();
	        obj.name = "Anu (Contractor)";
	        obj.paymentPerHour = 500;
	        obj.workingHours = 6;

	        System.out.println(obj.name + " earns: " + obj.calculateSalary() + " per day");
	        
	        FullTimeEmployee obj1 = new FullTimeEmployee();
	        obj1.name = "Vinu (Full-Time)";
	        obj1.paymentPerHour = 500;

	        System.out.println(obj1.name + " earns: " + obj1.calculateSalary() + " per day");
	    }
}
	
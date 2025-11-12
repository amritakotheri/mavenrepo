package abstraction;

public class Contractor extends Employee {
	int workingHours;
    public int calculateSalary() 
    {
        return paymentPerHour * workingHours;
    }
}


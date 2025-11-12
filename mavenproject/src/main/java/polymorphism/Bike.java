package polymorphism; 

public class Bike extends Car
{

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.alto();
		
		// TODO Auto-generated method stub

	}
	public void alto() 
	{
		super.alto();
		System.out.println("car beeps");
	}

}

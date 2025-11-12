package polymorphism;

public class OnSeason  {
	
	  public void discount(double price) 
	  {
	        double discountAmount = price * 0.40;  // 40% discount
	        double finalPrice = price - discountAmount;
	        System.out.println("Onseason Purchase:");
	        System.out.println("Original Price: " + price);
	        System.out.println("Discount: " + discountAmount);
	        System.out.println("Final Price: " + finalPrice);
	    }

}

package polymorphism;

public class OffSeason extends OnSeason {
	
	 public void discount(double price)
	 {
		 super.discount(price);
	        double discountAmount = price * 0.15;  // 15% discount
	        double finalPrice = price - discountAmount;
	        System.out.println("Offseason Purchase:");
	        System.out.println("Original Price: " + price);
	        System.out.println("Discount: " + discountAmount);
	        System.out.println("Final Price: " + finalPrice);
	    }
	 public static void main (String args[])
	 {
		 
	        OffSeason obj = new OffSeason(); 

	        double price1 = 5000;
	        double price2 = 3000;

	        System.out.println("------ Onseason Discount ------");
	        obj.discount(price1);  

	        System.out.println("\n------ Offseason Discount ------");
	        obj.discount(price2); 
	    }
	
	 }



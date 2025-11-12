package collection;

import java.util.ArrayList;

public class CollectionRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("List of elements: " + colors);
	        
	        String element=colors.remove(3);
	        System.out.println("removed element list is "+element);

	}

}

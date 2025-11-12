package collection;

import java.util.*;

public class CollectionRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("List of elements: " + colors);
	        
	        String element=colors.get(3);
	        System.out.println("the element retrieved is "+element);
	    }
	}



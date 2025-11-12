package collection;

import java.util.*;

public class CollectionLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");
	        System.out.println("List of elements: " + colors);
	        String target="Black";
	        if(colors.contains(target))
	        {
	        	System.out.println(target+ " is found in list at index "+colors.indexOf(target));
	        }
	        else
	        {
	        	System.out.println("target not found");
	        }

	}

}

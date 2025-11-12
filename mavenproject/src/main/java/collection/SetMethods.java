package collection;

import java.util.*;


public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set <String> fruit1=new TreeSet<String>();
	        fruit1.add("apple");
	        fruit1.add("kiwi");
	        fruit1.add("strawberry");
	        fruit1.add("banana");
	        System.out.println(fruit1);
	        
	     Set<String> color=new TreeSet<String>();
	     color.add("blue");
	     color.add("green");
	     color.add("red");
	     color.add("pink");
	     System.out.println(color);
	     
	     //method1 addall()   used in both set and list
	     fruit1.addAll(color);
	     System.out.println(fruit1);
	     System.out.println(color);
	     
	     //2 containsAll()
	     System.out.println(color.containsAll(fruit1));
	     
	     //3 removesAll()
	     System.out.println(fruit1.removeAll(color));
	     System.out.println(fruit1);
	     
	     //4 isEmpty()
	     System.out.println(color.isEmpty());
	}

}

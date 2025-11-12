package collection;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List <String> fruit=new LinkedList<String>();
		  //method1 add()
	        fruit.add("apple");
	        fruit.add("kiwi");
	        fruit.add("strawberry");
	        fruit.add("banana");
	        System.out.println(fruit);
	        
	        //method2 get()
	        System.out.println(fruit.get(1));
	        
	        //3 set()
	        fruit.set(2, "berry");
	        System.out.println(fruit);
	        
	        //4 indexOf()
	        fruit.add("apple");
	        System.out.println(fruit);
	        System.out.println(fruit.indexOf("apple"));
            
	        //5 lastIndexOf()
	        System.out.println(fruit.lastIndexOf("apple"));
	        
	        //6remove()
	        fruit.remove(4);
	        System.out.println(fruit);
	        
	        //7contains()
	        System.out.println(fruit.contains("orange"));
	        
	        //8 isEmpty()
	        System.out.println(fruit.isEmpty());
	        
	        //9 size()
	        System.out.println(fruit.size());
	        
	}

}

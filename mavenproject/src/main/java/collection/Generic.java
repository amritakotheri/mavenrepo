package collection;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List <String> fruit=new LinkedList<String>();
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("strawberry");
        fruit.add("banana");
        System.out.println(fruit);
        
        Set <String> fruit1=new TreeSet<String>();
        fruit1.add("apple");
        fruit1.add("kiwi");
        fruit1.add("strawberry");
        fruit1.add("banana");
        System.out.println(fruit1);
	}

}

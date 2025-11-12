package collection;

import java.util.*;


public class IterartorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Set<String> color=new HashSet<String>();
		     color.add("blue");
		     color.add("green");
		     color.add("red");
		     color.add("pink");
		     System.out.println(color);
		     /*using for each
		      * for(String b:color)
		      * {
		      * sop(b);
		      * }
		      */
		     
		     Iterator<String> i=color.iterator();
		     while(i.hasNext())
		     {
		    	 System.out.println(i.next());
		     }
		     i.remove();
		     System.out.println(color);
		     
	}

}

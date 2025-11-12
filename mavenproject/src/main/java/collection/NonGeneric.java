package collection;

import java.util.*;


public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List data=new ArrayList(); //LinkedList also supported
		data.add(12);
		data.add("friend");
		data.add('a');
		data.add(3.5f);
		System.out.println(data);
		
		Set data1=new HashSet();  //in nongeneric treeset is not supported
		data1.add(12);
		data1.add("friend");
		data1.add('a');
		data1.add(3.5f);
		System.out.println(data1);

	}

}
